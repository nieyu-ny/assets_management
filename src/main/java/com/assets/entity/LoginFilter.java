package com.assets.entity;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user on 2016/5/27.
 */
public class LoginFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest hsp = (HttpServletRequest) req;
        User lu = (User) hsp.getSession().getAttribute("loginUser");
        if (lu == null) {
            ((HttpServletResponse) resp).sendRedirect(hsp.getContextPath() + "/login/do_login");
        }
        //    chain.dofilter(req,resp);
        filterChain.doFilter(req, resp);
    }

    @Override
    public void destroy() {

    }
}
