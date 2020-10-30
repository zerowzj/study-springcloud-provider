package study.springcloud.provider.timeout;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "study-springcloud-provider")
public interface TimeoutService {

    @RequestMapping("/timeout")
    String timeout(@RequestParam("timeout") Long timeout);
}
