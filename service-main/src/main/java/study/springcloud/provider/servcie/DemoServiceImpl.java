package study.springcloud.provider.servcie;

import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.DemoService;

@RestController
public class DemoServiceImpl implements DemoService {

    @Override
    public String hello(String name) {
            return null;
    }
}
