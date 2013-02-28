package task;

import net.wukong.dao.impl.RssNewsDaoImpl;
import net.wukong.rssnews.RssNews;

public class Task6 implements Runnable {

	public void run() {
		RssNewsDaoImpl rndi = new RssNewsDaoImpl();
		RssNews rssNews = new RssNews();
		rndi.loadXinCheNews(rssNews);
		rndi.loadYanChuNews(rssNews);
		rndi.loadYeJieNews(rssNews);
		
	}

}
