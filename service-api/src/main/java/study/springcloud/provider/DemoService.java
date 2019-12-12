package study.springcloud.provider;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "study-springcloud-provider")
public interface DemoService {

    @PostMapping("/sayHi")
    String sayHi(@RequestParam("name") String name);

    @PostMapping("/getServerInfo")
    String getServerInfo();

    @PostMapping("/waitFor")
    String waitFor(@RequestParam("seconds")  Long seconds);
}
