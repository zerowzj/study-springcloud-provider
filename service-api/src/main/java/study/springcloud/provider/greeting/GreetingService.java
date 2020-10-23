package study.springcloud.provider.greeting;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "study-springcloud-provider")
public interface GreetingService {

    @GetMapping("/sayHi")
    String sayHi();

    @PostMapping("/sayBye")
    String sayBye();

}
