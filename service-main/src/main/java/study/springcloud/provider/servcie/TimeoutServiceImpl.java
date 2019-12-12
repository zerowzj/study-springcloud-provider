package study.springcloud.provider.servcie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.TimeoutService;

import java.util.concurrent.TimeUnit;

@RestController
public class TimeoutServiceImpl implements TimeoutService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TimeoutServiceImpl.class);

    @Override
    public String await(Long timeout) {
        long start = System.currentTimeMillis();
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        LOGGER.info("cost time: {}", System.currentTimeMillis() - start);
        return "success";
    }
}
