package study.springcloud.provider.exception;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "study-springcloud-provider")
public interface ExceptionService {

    @RequestMapping("/throwEx")
    String throwEx();
}
