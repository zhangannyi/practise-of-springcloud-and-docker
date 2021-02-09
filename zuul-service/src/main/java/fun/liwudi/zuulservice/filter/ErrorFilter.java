package fun.liwudi.zuulservice.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author 李武第
 */
public class ErrorFilter extends ZuulFilter {

    public static Logger logger = LoggerFactory.getLogger(ErrorFilter.class);
    @Override
    public String filterType() {
        return "error";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        // Remove error code to prevent further error handling in follow up filters
        // 这里有个坑，就是如果不删除这个key的话，
        // 就不会执行 zuul的SendResponseFilter，这个SendResponseFilter是负责写response的，
        // 导致的问题就会没有任何返回值，
        requestContext.remove("throwable");
        requestContext.setSendZuulResponse(false);
        requestContext.getResponse().setContentType("application/json");
        requestContext.setResponseBody(HttpStatus.REQUEST_TIMEOUT.getReasonPhrase());
        requestContext.setResponseStatusCode(HttpStatus.REQUEST_TIMEOUT.value());
        return null;

    }
}
