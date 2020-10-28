package study.springcloud.provider.greeting;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "study-springcloud-provider")
public interface GreetingService {

    @RequestMapping("/sayHi")
    String sayHi();

    @RequestMapping("/sayBye")
    String sayBye();
}
