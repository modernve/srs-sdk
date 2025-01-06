package sdk.api;

public class SDPRequest {
    private String sdp;
    private String api;
    private String streamurl;

    public String getSdp() {
        return sdp;
    }

    public void setSdp(String sdp) {
        this.sdp = sdp;
    }

    @Override
    public String toString() {
        return "SDPRequest{" +
                "sdp='" + sdp + '\'' +
                ", api='" + api + '\'' +
                ", streamurl='" + streamurl + '\'' +
                '}';
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getStreamurl() {
        return streamurl;
    }

    public void setStreamurl(String streamurl) {
        this.streamurl = streamurl;
    }
}
