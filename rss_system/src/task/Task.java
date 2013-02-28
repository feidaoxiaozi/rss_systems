package task;

import net.wukong.dao.impl.RssNewsDaoImpl;
import net.wukong.rssnews.RssNews;

public class Task implements Runnable {

	public void run() {
		RssNewsDaoImpl rndi = new RssNewsDaoImpl();
		RssNews rssNews = new RssNews();
		rndi.loadAoYunNews(rssNews);
		rndi.loadCBANews(rssNews);
		rndi.loadClfsNews(rssNews);
		rndi.loadDaoGouNews(rssNews);
		rndi.loadDianNaoNews(rssNews);			
	}

}
