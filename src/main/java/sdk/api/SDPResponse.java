package sdk.api;

public class SDPResponse {

    private Integer code;
    private String pid;
    private String sdp;
    private String server;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getSdp() {
        return sdp;
    }

    public void setSdp(String sdp) {
        this.sdp = sdp;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public String toString() {
        return "SDPResponse{" +
                "code=" + code +
                ", pid='" + pid + '\'' +
                ", sdp='" + sdp + '\'' +
                ", server='" + server + '\'' +
                ", service='" + service + '\'' +
                ", sessionId='" + sessionId + '\'' +
                '}';
    }

    private String service;
    private String sessionId;
}
