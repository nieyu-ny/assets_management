package com.assets.filter;

import com.assets.entity.SystemContext;

import javax.servlet.*;
import java.io.IOException;
/**
 * Created by nieyu on 2016/8/16.
 */

/**
 * 分页使用的过滤器
 */


public class SystemContextFilter implements Filter {


    @Override

    public void destroy() {


    }


    @Override

    public void doFilter(ServletRequest req, ServletResponse resp,

                         FilterChain chain) throws IOException, ServletException {

        try {

            int pageOffset = 0;

            int pageSize = 15;

            String sort = req.getParameter("sort");

            String order = req.getParameter("order");

            //          System.out.println("sort-------------------->" + sort);

            //          System.out.println("order-------------------->" + order);

            try {

                pageOffset = Integer.parseInt(req.getParameter("pager.offset"));

                //              System.out.println("pageOffset-------------------->" + pageOffset);

            } catch (NumberFormatException e) {

            }

            SystemContext.setOrder(order);

            SystemContext.setSort(sort);

            SystemContext.setPageOffset(pageOffset);

            SystemContext.setPageSize(pageSize);

            chain.doFilter(req, resp);

        } finally {

            SystemContext.removePageOffset();

            SystemContext.removePageSize();

            SystemContext.removeOrder();

            SystemContext.removeSort();

            SystemContext.removeRealPath();

        }

    }


    @Override

    public void init(FilterConfig cfg) throws ServletException {


    }


}
