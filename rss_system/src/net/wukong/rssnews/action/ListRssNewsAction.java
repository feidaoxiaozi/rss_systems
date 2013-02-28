package net.wukong.rssnews.action;

import net.wukong.rssnews.RssNews;
import net.wukong.service.RssNewsService;
import com.opensymphony.xwork2.ActionSupport;

public class ListRssNewsAction extends ActionSupport {
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
	@SuppressWarnings("unchecked")
	public String execute() throws Exception {
		this.rssNews = service.queryForPage(40, page);			
		return SUCCESS;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
}
