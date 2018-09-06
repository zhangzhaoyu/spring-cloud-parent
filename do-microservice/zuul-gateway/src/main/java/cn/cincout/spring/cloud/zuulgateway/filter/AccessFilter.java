package cn.cincout.spring.cloud.zuulgateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhaoyu on 18-3-2.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Slf4j
@Component
public class AccessFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
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
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        String url = request.getRequestURL().toString();
        log.info("send {} request to {}", request.getMethod(), url);

        Object accessToken = request.getParameter("accessToken");
        if(url !=null && !url.contains(".") && accessToken == null) {
            log.warn("access token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            ctx.put("error.status_code", HttpServletResponse.SC_FORBIDDEN);
            ctx.put("error.exception", "access token is empty");
            throw new RuntimeException("access token is empty");
        }
        log.info("access token ok");
        return null;
    }
}
