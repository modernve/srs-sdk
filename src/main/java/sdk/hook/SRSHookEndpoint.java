package sdk.hook;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/sdk/srs/hook")
public class SRSHookEndpoint {

    private final SRSHookHandler srsHookHandler;

    public SRSHookEndpoint(SRSHookHandler srsHookHandler) {
        this.srsHookHandler = srsHookHandler;
    }

    @PostMapping("/on_publish")
    public ResponseEntity<Map<String, Integer>> publish(@RequestBody SRSHookData data) {
        System.out.println(data.toString());
        boolean b = srsHookHandler.onPublish(data);
        Map<String, Integer> map = new HashMap<>();
        map.put("code", b ? 0 : 1);
        return ResponseEntity.ok(map);
    }

    @PostMapping("/on_unpublish")
    public ResponseEntity<Object> unpublish(@RequestBody SRSHookData data) {
        srsHookHandler.onUnpublish(data);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/on_play")
    public ResponseEntity<Map<String, Integer>> play(@RequestBody SRSHookData data) {
        boolean b = srsHookHandler.onPlay(data);
        Map<String, Integer> map = new HashMap<>();
        map.put("code", b ? 0 : 1);
        return ResponseEntity.ok(map);
    }

    @PostMapping("/on_stop")
    public ResponseEntity<Object> stop(@RequestBody SRSHookData object) {
        srsHookHandler.onStop(object);
        return ResponseEntity.ok().build();
    }
}
