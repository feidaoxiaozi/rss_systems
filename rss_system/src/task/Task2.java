package task;

import net.wukong.dao.impl.RssNewsDaoImpl;
import net.wukong.rssnews.RssNews;

public class Task2 implements Runnable {

	public void run() {
		RssNewsDaoImpl rndi = new RssNewsDaoImpl();
		RssNews rssNews = new RssNews();
		rndi.loadHlwplNews(rssNews);
		rndi.loadHotYxNews(rssNews);
		rndi.loadHqsyNews(rssNews);
		rndi.loadRwdtNews(rssNews);
		rndi.loadJfjsNews(rssNews);
			
	}

}
