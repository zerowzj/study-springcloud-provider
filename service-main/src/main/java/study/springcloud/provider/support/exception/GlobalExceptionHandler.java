package study.springcloud.provider.support.exception;

import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Throwable.class)
    public Map<String, Object> handle(Throwable ex) {
        ex.printStackTrace();
        Map<String, Object> result = Maps.newHashMap();
        result.put("code", "9999");
        result.put("desc", ex.getMessage());
        return result;
    }
}
