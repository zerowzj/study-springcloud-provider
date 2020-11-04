package study.springcloud.provider.timeout;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "study-springcloud-provider")
public interface TimeoutService {

    @GetMapping("/timeoutByGet")
    String timeoutByGet(@RequestParam("timeout") Long timeout);

    @PostMapping("/timeoutByPost")
    String timeoutByPost(@RequestParam("timeout") Long timeout);
}
