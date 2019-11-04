package study.springcloud.provider.service.servcie;

import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.service.DemoService;

@RestController
public class DemoServiceImpl implements DemoService {

    @Override
    public String hello(String name) {
            return null;
    }
}
