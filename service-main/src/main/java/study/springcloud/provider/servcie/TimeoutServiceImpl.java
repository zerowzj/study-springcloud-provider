package study.springcloud.provider.servcie;

import study.springcloud.provider.TimeoutService;

import java.util.concurrent.TimeUnit;

public class TimeoutServiceImpl implements TimeoutService {

    @Override
    public String await(Long timeout) {
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "success";
    }
}
