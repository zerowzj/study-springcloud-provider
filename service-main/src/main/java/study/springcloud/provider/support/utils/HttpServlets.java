package study.springcloud.provider.support.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServlets {

    public static HttpServletRequest getRequest() {
        ServletRequestAttributes attributes = getAttributes();
        HttpServletRequest request = attributes.getRequest();
        return request;
    }

    public static HttpServletResponse getResponse() {
        ServletRequestAttributes attributes = getAttributes();
        HttpServletResponse response = attributes.getResponse();
        return response;
    }

    public static ServletRequestAttributes getAttributes() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return attributes;
    }
}
