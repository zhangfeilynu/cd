package com.chinaredstar.cd.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MyTestFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("1111111111111111111111111");
		log.info("filter 初始化");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("2222222222222222222222222");
		log.info("doFilter 请求处理");
		// TODO 进行业务逻辑

		// 链路 直接传给下一个过滤器
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("33333333333333333333333333");
		log.info("filter 销毁");
	}

}