package study.springcloud.provider.servcie;

import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.RetryService;

import javax.servlet.http.HttpServletResponse;

@RestController
public class RetryServiceImpl implements RetryService {


    @Override
    public void retry404(HttpServletResponse response) {
        try {
            response.sendError(404);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void retry500(HttpServletResponse response) {
        try {
            response.sendError(500);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
