package sdk.hook;

public class DefaultSRSHookHandler implements SRSHookHandler {
    
    @Override
    public boolean onPublish(SRSHookData data) {
        return true;
    }

    @Override
    public void onUnpublish(SRSHookData data) {
    }

    @Override
    public boolean onPlay(SRSHookData data) {
        return true;
    }

    @Override
    public void onStop(SRSHookData data) {
    }
} 