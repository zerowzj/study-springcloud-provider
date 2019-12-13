package study.springcloud.provider.servcie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import study.springcloud.provider.LoadBalanceService;

public class LoadBalanceServiceImpl implements LoadBalanceService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Autowired
    private Environment environment;

    @Override
    public String getServerInfo() {
        LOGGER.info("i am getServerInfo");
        String instanceId = environment.getProperty("eureka.instance.instance-id");
        return "instance-id: " + instanceId;
    }
}
