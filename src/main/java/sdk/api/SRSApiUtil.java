package sdk.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SRSApiUtil {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static String baseUrl;

    // 初始化方法，由Spring调用
    public static void init(String ip, int port) {
        baseUrl = String.format("http://%s:%d/rtc/v1", ip, port);
    }

    public static SDPResponse rtcPublish(SDPRequest sdpRequest) throws URISyntaxException, IOException {
        return sendRequest(sdpRequest, "/publish");
    }

    public static SDPResponse rtcPlay(SDPRequest sdpRequest) throws URISyntaxException, IOException {
        return sendRequest(sdpRequest, "/play");
    }

    private static SDPResponse sendRequest(SDPRequest sdpRequest, String path) throws URISyntaxException, IOException {
        if (baseUrl == null) {
            throw new IllegalStateException("SRSApiUtil has not been initialized. Please ensure SRSConfig is properly configured.");
        }

        // 确保 baseUrl 末尾没有 '/' 且 path 以 '/' 开头
        String fullUrl = baseUrl + (path.startsWith("/") ? path : "/" + path);
        URI uri = new URI(fullUrl);
        URL url = uri.toURL();
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        
        try {
            // 设置请求属性
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);
            connection.setDoInput(true);

            // 写入请求数据
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = objectMapper.writeValueAsBytes(sdpRequest);
                os.write(input, 0, input.length);
            }

            // 获取响应
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(connection.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                return objectMapper.readValue(response.toString(), SDPResponse.class);
            }
        } finally {
            connection.disconnect();
        }
    }
}
