package study.springcloud.provider.servcie;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import study.springcloud.provider.LoadBalanceService;

@Slf4j
public class LoadBalanceServiceImpl implements LoadBalanceService {

    @Autowired
    private Environment environment;

    @Override
    public String getServerInfo() {
        log.info("i am getServerInfo");
        String instanceId = environment.getProperty("eureka.instance.instance-id");
        return "instance-id: " + instanceId;
    }
}
