package study.springcloud.provider;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletResponse;

@FeignClient(name = "study-springcloud-provider")
public interface RetryService {

    @PostMapping("/404")
    void retry404(HttpServletResponse response);

    @PostMapping("/500")
    void retry500(HttpServletResponse response);

}
