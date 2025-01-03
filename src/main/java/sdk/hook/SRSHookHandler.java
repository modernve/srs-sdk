package sdk.hook;

public interface SRSHookHandler {

    boolean onPublish(SRSHookData data);

    void onUnpublish(SRSHookData data);
    
    boolean onPlay(SRSHookData data);

    void onStop(SRSHookData data);
}
