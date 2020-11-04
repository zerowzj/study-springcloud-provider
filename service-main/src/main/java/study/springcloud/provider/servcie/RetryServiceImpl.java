package study.springcloud.provider.servcie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.retry.RetryService;
import study.springcloud.provider.support.utils.HttpServlets;

@Slf4j
@RestController
public class RetryServiceImpl implements RetryService {

    @Override
    public void retryByGet(int code) {
        log.info(">>>>>> code= {}", code);
        try {
            HttpServlets.getResponse().sendError(code);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void retryByPost(int code) {
        retryByGet(code);
    }
}
