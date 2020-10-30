package study.springcloud.provider.loadbalance;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@FeignClient(name = "study-springcloud-provider")
public interface LoadBalanceService {

    @RequestMapping("/getServerInfo")
    Map<String, Object> getServerInfo();
}
