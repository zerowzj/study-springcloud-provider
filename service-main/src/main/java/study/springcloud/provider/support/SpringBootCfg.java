package study.springcloud.provider.support;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "study.springcloud.provider")
public class SpringBootCfg {
}
