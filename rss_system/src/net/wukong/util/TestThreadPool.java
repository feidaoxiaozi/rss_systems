package net.wukong.util;

import task.Task;
import task.Task1;
import task.Task10;
import task.Task11;
import task.Task12;
import task.Task13;
import task.Task2;
import task.Task3;
import task.Task4;
import task.Task5;
import task.Task6;
import task.Task7;
import task.Task8;
import task.Task9;

public class TestThreadPool {
	 public void getThreadPool() {  
	        // 创建3个线程的线程池   
		 //public static void main(String[] args) {  
		        // 创建3个线程的线程池  
		        ThreadPool t = ThreadPool.getThreadPool(1);  
		        t.execute(new Runnable[] {new Task(),new Task1(),new Task2(),new Task3(),new Task4(),new Task5(),new Task6(),
		        		new Task7(),new Task8(),new Task9(),new Task10(),new Task11(),new Task12(),new Task13()});		        
		        System.out.println(t);  
		        t.destroy();// 所有线程都执行完成才destory  
		        System.out.println(t);  
		    }  
}
