package net.wukong.util;

import java.util.Timer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class RoleListener implements ServletContextListener{
	private Timer timer = null;
		  public void contextInitialized(ServletContextEvent event) {
		    timer = new Timer(true);
		    //��������ƻ��������ͼ��ʱ��
		    timer.schedule(new MyTask(), 0, 7200000);
		  }
		  public void contextDestroyed(ServletContextEvent event) {
		    timer.cancel();
		  }		

}
