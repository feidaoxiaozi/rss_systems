package net.wukong.util;

import java.util.Timer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class RoleListener implements ServletContextListener{
	private Timer timer = null;
		  public void contextInitialized(ServletContextEvent event) {
		    timer = new Timer(true);
		    //设置任务计划，启动和间隔时间
		    timer.schedule(new MyTask(), 0, 7200000);
		  }
		  public void contextDestroyed(ServletContextEvent event) {
		    timer.cancel();
		  }		

}
