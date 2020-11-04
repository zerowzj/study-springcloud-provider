package study.springcloud.provider.retry;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "study-springcloud-provider")

public interface RetryService {

    @GetMapping("/retryByGet")
    void retryByGet(@RequestParam("code") int code);

    @PostMapping("/retryByPost")
    void retryByPost(@RequestParam("code") int code);
}
