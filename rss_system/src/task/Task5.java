package task;

import net.wukong.dao.impl.RssNewsDaoImpl;
import net.wukong.rssnews.RssNews;

public class Task5 implements Runnable {

	public void run() {
		RssNewsDaoImpl rndi = new RssNewsDaoImpl();
		RssNews rssNews = new RssNews();
		rndi.loadShwxNews(rssNews);
		rndi.loadShyfNews(rssNews);
		rndi.loadSsyqNews(rssNews);
		rndi.loadSzywNews(rssNews);
		rndi.loadThjjNews(rssNews);
			
	}

}
