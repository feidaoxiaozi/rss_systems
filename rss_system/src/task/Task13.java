package task;

import net.wukong.dao.impl.RssNewsDaoImpl;
import net.wukong.rssnews.RssNews;

public class Task13 implements Runnable{

	public void run() {
		RssNewsDaoImpl rndi = new RssNewsDaoImpl();
		RssNews rssNews = new RssNews();
		rndi.loadZcfxNews(rssNews);
		rndi.loadZgjqNews(rssNews);
		rndi.loadZhtyNews(rssNews);
		rndi.loadZongYiNews(rssNews);
		rndi.loadZqskNews(rssNews);	
		
	}

}
