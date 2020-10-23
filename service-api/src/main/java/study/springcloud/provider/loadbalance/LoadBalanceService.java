package study.springcloud.provider.loadbalance;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "study-springcloud-provider")
public interface LoadBalanceService {

    @PostMapping("/getServerInfo")
    String getServerInfo();
}
