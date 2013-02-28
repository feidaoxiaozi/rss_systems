package net.wukong.rssnews.action;

import net.wukong.util.MyTask;

import com.opensymphony.xwork2.ActionSupport;

public class StartRoleAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		MyTask task = new MyTask();
		task.run();
		return "SUCCESS";
	}

}
