//package com.atqgh.springboot.config;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import java.io.IOException;
//
///**
// * @Author: qiguohui
// * @Description:
// * @Date: Created in 11:25 2019/7/19
// * @Modified By:
// **/
//@WebFilter(urlPatterns = "/*",filterName = "filter1")
//public class FilterAnnotationTest implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        System.out.println("过滤器1开始初始化");
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        System.out.println("过滤器1开始工作");
//        filterChain.doFilter(servletRequest,servletResponse);
//    }
//
//    @Override
//    public void destroy() {
//        System.out.println("过滤器1销毁");
//    }
//}
