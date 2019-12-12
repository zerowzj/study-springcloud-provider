package study.springcloud.provider.servcie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.DemoService;

import java.util.concurrent.TimeUnit;

@RestController
public class DemoServiceImpl implements DemoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Autowired
    private Environment environment;

    @Override
    public String sayHi(String name) {
        LOGGER.info("SFFFFFFFFFFFFFFF");
        return "hello, " + name;
    }

    @Override
    public String getServerInfo() {
        LOGGER.info("i am getServerInfo");
        String instanceId = environment.getProperty("eureka.instance.instance-id");
        return "instance-id : " + instanceId;
    }

    @Override
    public String waitFor(Long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "success";
    }
}
