package net.wukong.util;

import java.util.TimerTask;

public class MyTask extends TimerTask{

	@Override
	public void run() {
		TestThreadPool pool = new TestThreadPool();
		pool.getThreadPool();
	}
	 	 
}
