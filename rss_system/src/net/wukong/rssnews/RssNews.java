package net.wukong.rssnews;

import java.util.Date;
import java.util.List;


public class RssNews {
	@SuppressWarnings("unchecked")
	private List list;   //要返回的某一页的记录列表
	private int allRow;  //总记录数
	private int totalPage;  //总页数
	private int currentPage;  //当前页
	private int pageSize = 20; //每页记录数
	@SuppressWarnings("unused")
	private boolean isFirstPage;  //是否为第一页
	@SuppressWarnings("unused")
	private boolean isLastPage;  //是否为最后一页
	@SuppressWarnings("unused") 
	private boolean hasPreviousPage;  //是否有前一页
	@SuppressWarnings("unused")  
	private boolean hasNextPage; //是否有下一页
	private int newsId;
	
	private String title;
	
	private String url;
	
	private String resource;
	
	private Date time;
	
	private int attention;

	private int classes;
	

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public int getAttention() {
		return attention;
	}

	public void setAttention(int attention) {
		this.attention = attention;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getClasses() {
		return classes;
	}

	public void setClasses(int classes) {
		this.classes = classes;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public int getAllRow() {
		return allRow;
	}

	public void setAllRow(int allRow) {
		this.allRow = allRow;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public boolean isFirstPage() {
		return isFirstPage;
	}

	public void setFirstPage(boolean isFirstPage) {
		this.isFirstPage = isFirstPage;
	}

	public boolean isLastPage() {
		return isLastPage;
	}

	public void setLastPage(boolean isLastPage) {
		this.isLastPage = isLastPage;
	}

	public boolean isHasPreviousPage() {
		return hasPreviousPage;
	}

	public void setHasPreviousPage(boolean hasPreviousPage) {
		this.hasPreviousPage = hasPreviousPage;
	}

	public boolean isHasNextPage() {
		return hasNextPage;
	}

	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	//初始化分页信息
	public void init(){
		this.isFirstPage = isFirstPage();
		this.isLastPage = isLastPage();
		this.hasPreviousPage = isHasPreviousPage();
        this.hasNextPage = isHasNextPage();
        System.out.println("bbbbbbbbbbb");
	}

	/**
	 * 计算总页数,静态方法,供外部直接通过类名调用
	 * @param pageSize  每页记录数
	 * @param allRow  总记录数
	 * @return  总页数
　　 */
	public static int countTotalPage(final int pageSize,final int allRow){
		int totalPage = allRow % pageSize == 0 ? allRow/pageSize : allRow/pageSize+1;
		return totalPage;
	}
	/**
	 * 计算当前页开始记录
	 * @param pageSize  每页记录数
	 * @param currentPage  当前第几页
	 * @return 当前页开始记录号
	 */
	public static int countOffset(final int pageSize,final int currentPage){
		final int offset = pageSize * (currentPage-1);
		return offset;
	}
	/**
	 * 计算当前页,若为0或者请求的URL中没有"?page=",则用1代替
	 * @param page  传入的参数(可能为空,即0,则返回1)
	 * @return  当前页
	 */
	public static int countCurrentPage(int page){
		final int curPage = (page==0?1:page);
		return curPage;
	}
}
