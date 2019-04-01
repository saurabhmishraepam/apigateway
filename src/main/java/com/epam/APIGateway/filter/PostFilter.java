package com.epam.APIGateway.filter;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PostFilter extends ZuulFilter {
	private static final Logger logger=LoggerFactory.getLogger(PostFilter.class); 
	  @Override
	  public String filterType() {
	    return "post";
	  }
	 
	  @Override
	  public int filterOrder() {
	    return 1;
	  }
	 
	  @Override
	  public boolean shouldFilter() {
	    return true;
	  }
	 
	  @Override
	  public Object run() {
			
			RequestContext context=RequestContext.getCurrentContext();
					logger.info("PreFilter  "+context.getRequest().getRequestURL());
					logger.info(RequestContext.getCurrentContext().getResponseBody() );
					try {
						logger.info(""+context.getResponseDataStream().read());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		  logger.info("Inside Response Filter");
	 
	    return null;
	  }
	}