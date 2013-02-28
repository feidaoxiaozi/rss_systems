package task;

import net.wukong.dao.impl.RssNewsDaoImpl;
import net.wukong.rssnews.RssNews;

public class Task9 implements Runnable{

	public void run() {
		RssNewsDaoImpl rndi = new RssNewsDaoImpl();
		RssNews rssNews = new RssNews();
		rndi.loadJiaDianNews(rssNews);
		rndi.loadJiaJuNews(rssNews);
		rndi.loadJiangXNews(rssNews);
		rndi.loadJiuYeNews(rssNews);
		rndi.loadJjmsNews(rssNews);	
		
	}

}
