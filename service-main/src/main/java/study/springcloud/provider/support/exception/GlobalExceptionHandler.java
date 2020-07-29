package study.springcloud.provider.support.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Throwable.class)
    public Map<String, Object> handle(Throwable ex) {
        log.info("provider 异常了");
        ex.printStackTrace();
        Map<String, Object> result = new HashMap<>();
        result.put("code", "8989");
        result.put("desc", ex.getMessage());
        return result;
    }
}
