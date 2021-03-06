package study.springcloud.provider.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@FeignClient(name = "study-springcloud-provider")
public interface ServerService {

    @RequestMapping("/getServerInfo")
    Map<String, Object> getServerInfo();
}
