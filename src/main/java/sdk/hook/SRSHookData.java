package sdk.hook;

public class SRSHookData {
    private String server_id;
    private String service_id;
    private String action;
    private String client_id;
    private String ip;
    private String vhost;
    private String app;
    private String tcUrl;

    public String getServer_id() {
        return server_id;
    }

    public void setServer_id(String server_id) {
        this.server_id = server_id;
    }

    public String getService_id() {
        return service_id;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getVhost() {
        return vhost;
    }

    public void setVhost(String vhost) {
        this.vhost = vhost;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getTcUrl() {
        return tcUrl;
    }

    public void setTcUrl(String tcUrl) {
        this.tcUrl = tcUrl;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getStream_url() {
        return stream_url;
    }

    public void setStream_url(String stream_url) {
        this.stream_url = stream_url;
    }

    public String getStream_id() {
        return stream_id;
    }

    public void setStream_id(String stream_id) {
        this.stream_id = stream_id;
    }

    @Override
    public String toString() {
        return "SRSHookData{" +
                "server_id='" + server_id + '\'' +
                ", service_id='" + service_id + '\'' +
                ", action='" + action + '\'' +
                ", client_id='" + client_id + '\'' +
                ", ip='" + ip + '\'' +
                ", vhost='" + vhost + '\'' +
                ", app='" + app + '\'' +
                ", tcUrl='" + tcUrl + '\'' +
                ", stream='" + stream + '\'' +
                ", param='" + param + '\'' +
                ", stream_url='" + stream_url + '\'' +
                ", stream_id='" + stream_id + '\'' +
                '}';
    }

    private String stream;
    private String param;
    private String stream_url;
    private String stream_id;
}
