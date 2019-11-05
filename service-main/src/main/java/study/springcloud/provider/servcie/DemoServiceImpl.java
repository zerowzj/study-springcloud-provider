package study.springcloud.provider.servcie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.DemoService;

@RestController
public class DemoServiceImpl implements DemoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Override
    public String hello(String name) {
        LOGGER.info("SFFFFFFFFFFFFFFF");
            return null;
    }
}
