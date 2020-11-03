package study.springcloud.provider.servcie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.greeting.GreetingService;

@Slf4j
@RestController
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayHi() {
        log.info(">>>>>> hi");
        return "hello";
    }
}
