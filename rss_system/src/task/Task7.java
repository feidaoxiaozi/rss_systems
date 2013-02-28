package task;

import net.wukong.dao.impl.RssNewsDaoImpl;
import net.wukong.rssnews.RssNews;

public class Task7 implements Runnable{
	
	public void run() {
		RssNewsDaoImpl rndi = new RssNewsDaoImpl();
		RssNews rssNews = new RssNews();
		rndi.loadDianshNews(rssNews);
		rndi.loadDianYNews(rssNews);
		rndi.loadDzjjNews(rssNews);
		rndi.loadDzswNews(rssNews);
		rndi.loadFcjdNews(rssNews);	
	}
	
}
