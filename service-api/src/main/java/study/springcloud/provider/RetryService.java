package study.springcloud.provider;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "study-springcloud-provider")
public interface RetryService {

}
