package study.springcloud.provider.support;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//服务注册和发现
@EnableEurekaClient
//@EnableDiscoveryClient

@SpringBootApplication(scanBasePackages = "study.springcloud.provider")
public class SpringBootCfg {
}
