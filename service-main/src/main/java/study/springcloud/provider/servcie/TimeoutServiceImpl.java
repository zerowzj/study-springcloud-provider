package study.springcloud.provider.servcie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.timeout.TimeoutService;

import java.util.concurrent.TimeUnit;

@Slf4j
@RestController
public class TimeoutServiceImpl implements TimeoutService {

    @Override
    public String timeout(Long timeout) {
        log.info("receive the request: {} s", timeout);
        long start = System.currentTimeMillis();
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        log.info("cost time: {}", System.currentTimeMillis() - start);
        return "success";
    }
}
