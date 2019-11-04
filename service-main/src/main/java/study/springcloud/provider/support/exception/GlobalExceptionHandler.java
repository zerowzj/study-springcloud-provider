package study.springcloud.provider.support.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Throwable.class)
    public Map<String, Object> handle(Throwable ex) {
        ex.printStackTrace();
        Map<String, Object> result = new HashMap<>();
        result.put("code", "9999");
        result.put("desc", ex.getMessage());
        return result;
    }
}
