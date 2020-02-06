package study.springcloud.provider.servcie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.DemoService;

import java.util.concurrent.TimeUnit;

@Slf4j
@RestController
public class DemoServiceImpl implements DemoService {

    @Override
    public String await() {
        log.info("超时测试......");
        try {
            TimeUnit.HOURS.sleep(1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "await";
    }

    @Override
    public String sayHi(String name) {
        log.info("SFFFFFFFFFFFFFFF");
        return "hello, " + name;
    }
}
