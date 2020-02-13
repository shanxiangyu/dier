package com.atguigu.springboot.config.webconfig;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class HelloListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

		System.out.println("...銷毀");
	}
	@Override
	public void contextInitialized(ServletContextEvent sce) {

		System.err.println("...創建");
	}
}
