package study.springcloud.provider.servcie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.timeout.TimeoutService;

import java.util.concurrent.TimeUnit;

@Slf4j
@RestController
public class TimeoutServiceImpl implements TimeoutService {

    @Override
    public String timeoutByGet(Long timeout) {
        log.info(">>>>>> timeout= {}", timeout);
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (Exception ex) {
            throw new RuntimeException("", ex);
        }
        return "success";
    }

    @Override
    public String timeoutByPost(Long timeout) {
        return timeoutByGet(timeout);
    }
}
