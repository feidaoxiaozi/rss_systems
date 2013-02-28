package net.wukong.dao;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import net.wukong.rssnews.RssNews;

public interface RssNewsDao {
	
	public void loadSzywNews(RssNews rssNews);
	public void loadTWNews(RssNews rssNews);
	public void loadGangAoNews(RssNews rssNews);
	public void loadHqsyNews(RssNews rssNews);
	public void loadGjrwNews(RssNews rssNews);
	public void loadZgjqNews(RssNews rssNews);
	public void loadThjjNews(RssNews rssNews);
	public void loadGjjqNews(RssNews rssNews);
	public void loadGuPiaoNews(RssNews rssNews);
	public void loadLiCaiNews(RssNews rssNews);
	public void loadJjmsNews(RssNews rssNews);
	public void loadRwdtNews(RssNews rssNews);
	public void loadGsdtNews(RssNews rssNews);
	public void loadSsyqNews(RssNews rssNews);
	public void loadDzswNews(RssNews rssNews);
	public void loadWlyxNews(RssNews rssNews);
	public void loadHlwplNews(RssNews rssNews);
	public void loadGddtNews(RssNews rssNews);
	public void loadZcfxNews(RssNews rssNews);
	public void loadSczsNews(RssNews rssNews);
	public void loadJiaJuNews(RssNews rssNews);
	public void loadFcplNews(RssNews rssNews);
	public void loadFczxNews(RssNews rssNews);
	public void loadFcjdNews(RssNews rssNews);
	public void loadXinCheNews(RssNews rssNews);
	public void loadDaoGouNews(RssNews rssNews);
	public void loadGdhqNews(RssNews rssNews);
	public void loadWxyhNews(RssNews rssNews);
	public void loadNBANews(RssNews rssNews);
	public void loadGjzqNews(RssNews rssNews);
	public void loadGnzqNews(RssNews rssNews);
	public void loadCBANews(RssNews rssNews);
	public void loadZhtyNews(RssNews rssNews);
	public void loadAoYunNews(RssNews rssNews);
	public void loadMingXNews(RssNews rssNews);
	public void loadDianYNews(RssNews rssNews);
	public void loadDianshNews(RssNews rssNews);
	public void loadMusicNews(RssNews rssNews);
	public void loadZongYiNews(RssNews rssNews);
	public void loadYanChuNews(RssNews rssNews);
	public void loadJiangXNews(RssNews rssNews);
	public void loadWangYNews(RssNews rssNews);
	public void loadTvGamesNews(RssNews rssNews);
	public void loadDzjjNews(RssNews rssNews);
	public void loadHotYxNews(RssNews rssNews);
	public void loadMssjNews(RssNews rssNews);
	public void loadKaoShiNews(RssNews rssNews);
	public void loadLiuXueNews(RssNews rssNews);
	public void loadJiuYeNews(RssNews rssNews);
	public void loadClfsNews(RssNews rssNews);
	public void loadMrhfNews(RssNews rssNews);
	public void loadJfjsNews(RssNews rssNews);
	public void loadQglxNews(RssNews rssNews);
	public void loadJkysNews(RssNews rssNews);
	public void loadShouJiNews(RssNews rssNews);
	public void loadShuMaNews(RssNews rssNews);
	public void loadDianNaoNews(RssNews rssNews);
	public void loadKePuNews(RssNews rssNews);
	public void loadKjqtNews(RssNews rssNews);
	public void loadYeJieNews(RssNews rssNews);
	public void loadJiaDianNews(RssNews rssNews);
	public void loadKptpNews(RssNews rssNews);
	public void loadKxspNews(RssNews rssNews);
	public void loadKjjdNews(RssNews rssNews);
	public void loadShyfNews(RssNews rssNews);
	public void loadShwxNews(RssNews rssNews);
	public void loadZqskNews(RssNews rssNews);
	public void loadQwysNews(RssNews rssNews);
	public String getParameter();  
	public List queryForPage(final String hql,final int offset,final int length);
	public List queryForTitle(final String hql,final int offset,final int length,String keyWords,Timestamp smallTime,Timestamp bigTime,int bigAttention);
	public int getAllRowCount(String hql);
}
