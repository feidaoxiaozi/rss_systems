package task;

import net.wukong.dao.impl.RssNewsDaoImpl;
import net.wukong.rssnews.RssNews;

public class Task8 implements Runnable{

	public void run() {
		RssNewsDaoImpl rndi = new RssNewsDaoImpl();
		RssNews rssNews = new RssNews();
		rndi.loadGjjqNews(rssNews);
		rndi.loadGjrwNews(rssNews);
		rndi.loadGjzqNews(rssNews);
		rndi.loadGsdtNews(rssNews);
		rndi.loadGuPiaoNews(rssNews);
		
	}

}
