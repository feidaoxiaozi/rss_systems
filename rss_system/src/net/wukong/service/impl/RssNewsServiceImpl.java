package net.wukong.service.impl;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import net.wukong.dao.RssNewsDao;
import net.wukong.rssnews.RssNews;
import net.wukong.service.RssNewsService;

public class RssNewsServiceImpl implements RssNewsService {
	private RssNewsDao rssNewsDao;
   
	public RssNewsDao getRssNewsDao() {
		return rssNewsDao;
	}

	public void setRssNewsDao(RssNewsDao rssNewsDao) {
		this.rssNewsDao = rssNewsDao;
	}

	// public List<RssNews> findAllRssNews() {
	//		
	// return this.rssNewsDao.findAllRssNews();
	// }

	public void loadSzywNews(RssNews rssNews) {
		this.rssNewsDao.loadSzywNews(rssNews);

	}

	public void loadTWNews(RssNews rssNews) {
		this.rssNewsDao.loadTWNews(rssNews);

	}

	public void loadGangAoNews(RssNews rssNews) {
		this.rssNewsDao.loadGangAoNews(rssNews);

	}

	public void loadHqsyNews(RssNews rssNews) {
		this.rssNewsDao.loadHqsyNews(rssNews);
	}

	public void loadGjrwNews(RssNews rssNews) {
		this.rssNewsDao.loadGjrwNews(rssNews);

	}

	public void loadZgjqNews(RssNews rssNews) {
		this.rssNewsDao.loadZgjqNews(rssNews);

	}

	public void loadThjjNews(RssNews rssNews) {
		this.rssNewsDao.loadThjjNews(rssNews);

	}

	public void loadGjjqNews(RssNews rssNews) {
		this.rssNewsDao.loadGjjqNews(rssNews);

	}

	public void loadGuPiaoNews(RssNews rssNews) {
		this.rssNewsDao.loadGuPiaoNews(rssNews);

	}

	public void loadLiCaiNews(RssNews rssNews) {
		this.rssNewsDao.loadLiCaiNews(rssNews);

	}

	public void loadJjmsNews(RssNews rssNews) {
		this.rssNewsDao.loadJjmsNews(rssNews);

	}

	public void loadRwdtNews(RssNews rssNews) {
		this.rssNewsDao.loadRwdtNews(rssNews);

	}

	public void loadGsdtNews(RssNews rssNews) {
		this.rssNewsDao.loadGsdtNews(rssNews);

	}

	public void loadSsyqNews(RssNews rssNews) {
		this.rssNewsDao.loadSsyqNews(rssNews);

	}

	public void loadDzswNews(RssNews rssNews) {
		this.rssNewsDao.loadDzswNews(rssNews);

	}

	public void loadWlyxNews(RssNews rssNews) {
		this.rssNewsDao.loadWlyxNews(rssNews);

	}

	public void loadHlwplNews(RssNews rssNews) {
		this.rssNewsDao.loadHlwplNews(rssNews);

	}

	public void loadGddtNews(RssNews rssNews) {
		this.rssNewsDao.loadGddtNews(rssNews);

	}

	public void loadZcfxNews(RssNews rssNews) {
		this.rssNewsDao.loadZcfxNews(rssNews);

	}

	public void loadSczsNews(RssNews rssNews) {
		this.rssNewsDao.loadSczsNews(rssNews);

	}

	public void loadJiaJuNews(RssNews rssNews) {
		this.rssNewsDao.loadJiaJuNews(rssNews);

	}

	public void loadFcplNews(RssNews rssNews) {
		this.rssNewsDao.loadFcplNews(rssNews);

	}

	public void loadFczxNews(RssNews rssNews) {
		this.rssNewsDao.loadFczxNews(rssNews);

	}

	public void loadFcjdNews(RssNews rssNews) {
		this.rssNewsDao.loadFcjdNews(rssNews);

	}

	public void loadXinCheNews(RssNews rssNews) {
		this.rssNewsDao.loadXinCheNews(rssNews);

	}

	public void loadDaoGouNews(RssNews rssNews) {
		this.rssNewsDao.loadDaoGouNews(rssNews);

	}

	public void loadGdhqNews(RssNews rssNews) {
		this.rssNewsDao.loadGdhqNews(rssNews);

	}

	public void loadWxyhNews(RssNews rssNews) {
		this.rssNewsDao.loadWxyhNews(rssNews);

	}

	public void loadNBANews(RssNews rssNews) {
		this.rssNewsDao.loadNBANews(rssNews);

	}

	public void loadGjzqNews(RssNews rssNews) {
		this.rssNewsDao.loadGjzqNews(rssNews);

	}

	public void loadGnzqNews(RssNews rssNews) {
		this.rssNewsDao.loadGnzqNews(rssNews);

	}

	public void loadCBANews(RssNews rssNews) {
		this.rssNewsDao.loadCBANews(rssNews);

	}

	public void loadZhtyNews(RssNews rssNews) {
		this.rssNewsDao.loadZhtyNews(rssNews);

	}

	public void loadAoYunNews(RssNews rssNews) {
		this.rssNewsDao.loadAoYunNews(rssNews);

	}

	public void loadMingXNews(RssNews rssNews) {
		this.rssNewsDao.loadMingXNews(rssNews);

	}

	public void loadDianYNews(RssNews rssNews) {
		this.rssNewsDao.loadDianYNews(rssNews);

	}

	public void loadDianshNews(RssNews rssNews) {
		this.rssNewsDao.loadDianshNews(rssNews);

	}

	public void loadMusicNews(RssNews rssNews) {
		this.rssNewsDao.loadMusicNews(rssNews);

	}

	public void loadZongYiNews(RssNews rssNews) {
		this.rssNewsDao.loadZongYiNews(rssNews);

	}

	public void loadYanChuNews(RssNews rssNews) {
		this.rssNewsDao.loadYanChuNews(rssNews);

	}

	public void loadJiangXNews(RssNews rssNews) {
		this.rssNewsDao.loadJiangXNews(rssNews);

	}

	public void loadWangYNews(RssNews rssNews) {
		this.rssNewsDao.loadWangYNews(rssNews);

	}

	public void loadTvGamesNews(RssNews rssNews) {
		this.rssNewsDao.loadTvGamesNews(rssNews);

	}

	public void loadDzjjNews(RssNews rssNews) {
		this.rssNewsDao.loadTvGamesNews(rssNews);

	}

	public void loadHotYxNews(RssNews rssNews) {
		this.rssNewsDao.loadHotYxNews(rssNews);

	}

	public void loadMssjNews(RssNews rssNews) {
		this.rssNewsDao.loadMssjNews(rssNews);

	}

	public void loadKaoShiNews(RssNews rssNews) {
		this.rssNewsDao.loadKaoShiNews(rssNews);

	}

	public void loadLiuXueNews(RssNews rssNews) {
		this.rssNewsDao.loadLiuXueNews(rssNews);

	}

	public void loadJiuYeNews(RssNews rssNews) {
		this.rssNewsDao.loadJiuYeNews(rssNews);

	}

	public void loadClfsNews(RssNews rssNews) {
		this.rssNewsDao.loadClfsNews(rssNews);

	}

	public void loadMrhfNews(RssNews rssNews) {
		this.rssNewsDao.loadMrhfNews(rssNews);

	}

	public void loadJfjsNews(RssNews rssNews) {
		this.rssNewsDao.loadJfjsNews(rssNews);

	}

	public void loadQglxNews(RssNews rssNews) {
		this.rssNewsDao.loadQglxNews(rssNews);

	}

	public void loadJkysNews(RssNews rssNews) {
		this.rssNewsDao.loadJkysNews(rssNews);

	}

	public void loadShouJiNews(RssNews rssNews) {
		this.rssNewsDao.loadShouJiNews(rssNews);

	}

	public void loadShuMaNews(RssNews rssNews) {
		this.rssNewsDao.loadShuMaNews(rssNews);

	}

	public void loadDianNaoNews(RssNews rssNews) {
		this.rssNewsDao.loadDianNaoNews(rssNews);

	}

	public void loadKePuNews(RssNews rssNews) {
		this.rssNewsDao.loadKePuNews(rssNews);

	}

	public void loadKjqtNews(RssNews rssNews) {
		this.rssNewsDao.loadKjqtNews(rssNews);

	}

	public void loadYeJieNews(RssNews rssNews) {
		this.rssNewsDao.loadYeJieNews(rssNews);

	}

	public void loadJiaDianNews(RssNews rssNews) {
		this.rssNewsDao.loadJiaDianNews(rssNews);

	}

	public void loadKptpNews(RssNews rssNews) {
		this.rssNewsDao.loadKptpNews(rssNews);

	}

	public void loadKxspNews(RssNews rssNews) {
		this.rssNewsDao.loadKxspNews(rssNews);

	}

	public void loadKjjdNews(RssNews rssNews) {
		this.rssNewsDao.loadKjjdNews(rssNews);

	}

	public void loadShyfNews(RssNews rssNews) {
		this.rssNewsDao.loadShyfNews(rssNews);

	}

	public void loadShwxNews(RssNews rssNews) {
		this.rssNewsDao.loadShwxNews(rssNews);

	}

	public void loadZqskNews(RssNews rssNews) {
		this.rssNewsDao.loadZqskNews(rssNews);

	}

	public void loadQwysNews(RssNews rssNews) {
		this.rssNewsDao.loadQwysNews(rssNews);

	}

	public RssNews queryForPage(int pageSise, int currentPage) {
		
		String hql = getParameter(); // 查询语句

		int allRow = rssNewsDao.getAllRowCount(hql); // 总记录数
		int totalPage = RssNews.countTotalPage(pageSise, allRow); // 总页数

		final int offset = RssNews.countOffset(pageSise, currentPage); // 当前页开始记录

		final int length = pageSise; // 每页记录数

		List<RssNewsService> list = rssNewsDao
				.queryForPage(hql, offset, length); // "一页"的记录

		// 把分页信息保存到bean中
		RssNews rssNews = new RssNews();
		rssNews.setPageSize(pageSise);
		rssNews.setCurrentPage(currentPage);
		rssNews.setAllRow(allRow);
		rssNews.setTotalPage(totalPage);
		rssNews.setList(list);
		rssNews.init();
		return rssNews;
	}

	public String getParameter() {

		return this.rssNewsDao.getParameter();
	}
	
     public RssNews queryForTitle(int pageSise, int currentPage,String keyWords,Timestamp smallTime,Timestamp bigTime,int bigAttention){
    	 
    	 String hql = "from RssNews r where  r.title like '%"+keyWords+"%' and r.time between '"+smallTime+"' and '"+bigTime+"' and r.attention>'"+bigAttention+"'";        
 		int allRow = rssNewsDao.getAllRowCount(hql); 
 		int totalPage = RssNews.countTotalPage(pageSise, allRow); 

 		final int offset = RssNews.countOffset(pageSise, currentPage); 

 		final int length = pageSise; 

 		List<RssNewsService> list = rssNewsDao
 				.queryForTitle(hql, offset, length, keyWords, smallTime, bigTime, bigAttention); 
 		
 		RssNews rssNews = new RssNews();
 		rssNews.setPageSize(pageSise);
 		rssNews.setCurrentPage(currentPage);
 		rssNews.setAllRow(allRow);
 		rssNews.setTotalPage(totalPage);
 		rssNews.setList(list);
 		rssNews.init();
 		return rssNews;
     }
}
