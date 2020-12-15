package study.springcloud.provider.servcie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.exception.ExceptionService;

@Slf4j
@RestController
public class ExceptionServiceImpl implements ExceptionService {

    @Override
    public String throwEx() {
        String str = "";
        if ("".equalsIgnoreCase("")) {
            throw new RuntimeException("throw exception");
        }
        return null;
    }
}
