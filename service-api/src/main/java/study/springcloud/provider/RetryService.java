package study.springcloud.provider;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

@FeignClient(name = "study-springcloud-provider")
public interface RetryService {

    @PostMapping("/retry")
    void retry(@RequestParam("code") int code);
}
