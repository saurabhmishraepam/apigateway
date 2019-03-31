package com.epam.APIGateway.filter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class PreFilter extends ZuulFilter{
	private static final Logger logger=LoggerFactory.getLogger(PreFilter.class); 
	@Override
	public Object run() throws ZuulException {
		
		RequestContext context=RequestContext.getCurrentContext();
				logger.info("PreFilter  "+context.getRequest().getRequestURL());
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}
	
	
}
