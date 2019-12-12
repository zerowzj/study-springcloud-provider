package study.springcloud.provider.servcie;

import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.RetryService;

import javax.servlet.http.HttpServletResponse;

@RestController
public class RetryServiceImpl implements RetryService {

    @Override
    public void retry(int code, HttpServletResponse response) {
        try {
            response.sendError(code);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
