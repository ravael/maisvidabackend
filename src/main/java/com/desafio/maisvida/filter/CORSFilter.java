package com.desafio.maisvida.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CORSFilter implements Filter{

	
	@Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE,PATCH,OPTIONS");
        response.setHeader("Access-Control-Allow-Headers", "content-type, Access-Control-Allow-Origin, Access-Control-Allow-Credentials, Access-Control-Allow-Headers,Access-Control-Allow-Methods");
//        response.setHeader("Access-Control-Expose-Headers","Authorization");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

}

