package study.springcloud.provider.servcie;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.loadbalance.LoadBalanceService;

import java.util.Map;

@Slf4j
@RestController
public class LoadBalanceServiceImpl implements LoadBalanceService {

    @Autowired
    private Environment env;

    @Override
    public Map<String, Object> getServerInfo() {
        log.info("i am getServerInfo");
        String instanceId = env.getProperty("eureka.instance.instance-id");
        Map<String, Object> data = Maps.newHashMap();
        data.put("instanceId", instanceId);
        return data;
    }
}
