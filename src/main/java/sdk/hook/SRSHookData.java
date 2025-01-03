package sdk.hook;

import lombok.Data;

@Data
public class SRSHookData {
    private String server_id;
    private String service_id;
    private String action;
    private String client_id;
    private String ip;
    private String vhost;
    private String app;
    private String tcUrl;
    private String stream;
    private String param;
    private String stream_url;
    private String stream_id;
}
