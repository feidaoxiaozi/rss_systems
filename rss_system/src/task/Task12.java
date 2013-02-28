package task;

import net.wukong.dao.impl.RssNewsDaoImpl;
import net.wukong.rssnews.RssNews;

public class Task12 implements Runnable{

	public void run() {
		RssNewsDaoImpl rndi = new RssNewsDaoImpl();
		RssNews rssNews = new RssNews();
		rndi.loadTvGamesNews(rssNews);
		rndi.loadTWNews(rssNews);
		rndi.loadWangYNews(rssNews);
		rndi.loadWlyxNews(rssNews);
		rndi.loadWxyhNews(rssNews);	
	}

}
