package study.springcloud.provider.servcie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.DemoService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.TimeUnit;

@Slf4j
@RestController
public class DemoServiceImpl implements DemoService {

    @Override
    public String await() {
        log.info("======> await");
        try {
            TimeUnit.HOURS.sleep(1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "await";
    }

    @Override
    public String sayHi(String name) {
        log.info("======> sayHi");
        return "hello, " + name;
    }

    @RequestMapping("/exception")
    public void exception(HttpServletRequest request, HttpServletResponse response) {
        log.info("======> exception");
        throw new RuntimeException("异常测试");
    }
}
