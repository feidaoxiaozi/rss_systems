package task;

import net.wukong.dao.impl.RssNewsDaoImpl;
import net.wukong.rssnews.RssNews;

public class Task4 implements Runnable {

	public void run() {
		RssNewsDaoImpl rndi = new RssNewsDaoImpl();
		RssNews rssNews = new RssNews();
		rndi.loadMrhfNews(rssNews);
		rndi.loadMssjNews(rssNews);
		rndi.loadMusicNews(rssNews);
		rndi.loadNBANews(rssNews);
		rndi.loadQglxNews(rssNews);
				
	}

}
