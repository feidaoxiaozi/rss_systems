package task;

import net.wukong.dao.impl.RssNewsDaoImpl;
import net.wukong.rssnews.RssNews;

public class Task1 implements Runnable {

	public void run() {
		RssNewsDaoImpl rndi = new RssNewsDaoImpl();
		RssNews rssNews = new RssNews();		
		rndi.loadFcplNews(rssNews);
		rndi.loadFczxNews(rssNews);
		rndi.loadGangAoNews(rssNews);
		rndi.loadGddtNews(rssNews);
		rndi.loadGdhqNews(rssNews);
		
	}

}
