package task;

import net.wukong.dao.impl.RssNewsDaoImpl;
import net.wukong.rssnews.RssNews;

public class Task3 implements Runnable {

	public void run() {
		RssNewsDaoImpl rndi = new RssNewsDaoImpl();
		RssNews rssNews = new RssNews();
		rndi.loadJkysNews(rssNews);
		rndi.loadKaoShiNews(rssNews);
		rndi.loadKePuNews(rssNews);
		rndi.loadKjjdNews(rssNews);
		rndi.loadKjqtNews(rssNews);
				
	}

}
