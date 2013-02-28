package net.wukong.rssnews.action;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import net.wukong.rssnews.RssNews;
import net.wukong.service.RssNewsService;
import com.opensymphony.xwork2.ActionSupport;

public class FindNewsByTitleAction extends ActionSupport{
	private RssNews rssNews;
	private int page = 1;
	private RssNewsService service;
public RssNews getRssNews() {
		return rssNews;
	}
	public void setRssNews(RssNews rssNews) {
		this.rssNews = rssNews;
	}
	public RssNewsService getService() {
		return service;
	}
	public void setService(RssNewsService service) {
		this.service = service;
	}
@Override
@SuppressWarnings("unchecked")

	public String execute() throws Exception {
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	HttpServletRequest request = ServletActionContext.getRequest();
	    String keyWords = request.getParameter("keyWords");
	    Date smallTimes = df.parse(request.getParameter("smallTime"));
	    System.out.println("smallTimes$%$^%$%^^%^$="+smallTimes);
	    Date bigTimes = df.parse(request.getParameter("bigTime"));
	    System.out.println("bigTimes$%$^%$%^^%^$="+bigTimes);
	    Timestamp smallTime = new Timestamp(smallTimes.getTime());
	    System.out.println("smallTime$%$^%$%^^%^$="+smallTime);
	    Timestamp bigTime = new Timestamp(bigTimes.getTime());
	    System.out.println("bigTime$%$^%$%^^%^$="+bigTime);
	    int bigAttention = Integer.parseInt(request.getParameter("bigAttention"));	    	  
		this.rssNews = service.queryForTitle(40, page,keyWords,smallTime,bigTime,bigAttention);			
		return SUCCESS;
	}
public int getPage() {
	return page;
}
public void setPage(int page) {
	this.page = page;
}
}

