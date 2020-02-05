package study.springcloud.provider.servcie;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.DemoService;

@Slf4j
@RestController
public class DemoServiceImpl implements DemoService {


    @Autowired
    private Environment environment;

    @Override
    public String sayHi(String name) {
        log.info("SFFFFFFFFFFFFFFF");
        return "hello, " + name;
    }
}
