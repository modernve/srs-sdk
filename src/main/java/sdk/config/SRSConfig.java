package sdk.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import sdk.api.SRSApiUtil;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "srs.rtc")
public class SRSConfig {
    private String ip = "127.0.0.1"; 
    private int port = 1918;

    @PostConstruct
    public void init() {
        SRSApiUtil.init(ip, port);
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
} 