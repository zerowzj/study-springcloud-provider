package study.springcloud.provider.servcie;

import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.RetryService;
import study.springcloud.provider.support.util.HttpServlets;

@RestController
public class RetryServiceImpl implements RetryService {

    @Override
    public void retry(int code) {
        try {
            HttpServlets.getResponse().sendError(code);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
