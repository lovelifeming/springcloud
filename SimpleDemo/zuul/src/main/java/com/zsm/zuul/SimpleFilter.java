package com.zsm.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;


/**
 * Zuul 简单过虑器
 *
 * @Author :zengsm.
 * @Description :
 * @Date:Created in 2019/4/23 14:50.
 * @Modified By :
 */
public class SimpleFilter extends ZuulFilter
{
    /**
     * 前置过滤
     */
    @Override
    public String filterType()
    {
        return "pre";
    }

    /**
     * 过滤执行顺序
     */
    @Override
    public int filterOrder()
    {
        return 1;
    }

    /**
     * 是否执行过滤
     */
    @Override
    public boolean shouldFilter()
    {
        return true;
    }

    /**
     * 包含过滤器功能
     */
    @Override
    public Object run()
        throws ZuulException
    {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String method = request.getMethod();
        String url = request.getRequestURL().toString();
        System.out.printf("%s request %s\r\n", method, url);
        return null;
    }
}
