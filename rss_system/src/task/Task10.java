package task;

import net.wukong.dao.impl.RssNewsDaoImpl;
import net.wukong.rssnews.RssNews;

public class Task10 implements Runnable{

	public void run() {
		RssNewsDaoImpl rndi = new RssNewsDaoImpl();
		RssNews rssNews = new RssNews();
		rndi.loadKptpNews(rssNews);
		rndi.loadKxspNews(rssNews);
		rndi.loadLiCaiNews(rssNews);
		rndi.loadLiuXueNews(rssNews);
		rndi.loadMingXNews(rssNews);
		
	}

}
