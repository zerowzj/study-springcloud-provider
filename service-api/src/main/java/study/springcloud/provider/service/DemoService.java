package study.springcloud.provider.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "study-springcloud-provider")
public interface DemoService {

    @PostMapping("/hellol")
    String hello(@RequestParam("name") String name);
}
