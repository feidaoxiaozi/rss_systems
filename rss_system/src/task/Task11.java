package task;

import net.wukong.dao.impl.RssNewsDaoImpl;
import net.wukong.rssnews.RssNews;

public class Task11 implements Runnable{

	public void run() {
		RssNewsDaoImpl rndi = new RssNewsDaoImpl();
		RssNews rssNews = new RssNews();
		rndi.loadQwysNews(rssNews);
		rndi.loadRwdtNews(rssNews);
		rndi.loadSczsNews(rssNews);
		rndi.loadShouJiNews(rssNews);
		rndi.loadShuMaNews(rssNews);
		
	}

}
