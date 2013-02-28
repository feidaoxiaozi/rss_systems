package net.wukong.rssnews;

import java.util.Date;
import java.util.List;


public class RssNews {
	@SuppressWarnings("unchecked")
	private List list;   //Ҫ���ص�ĳһҳ�ļ�¼�б�
	private int allRow;  //�ܼ�¼��
	private int totalPage;  //��ҳ��
	private int currentPage;  //��ǰҳ
	private int pageSize = 20; //ÿҳ��¼��
	@SuppressWarnings("unused")
	private boolean isFirstPage;  //�Ƿ�Ϊ��һҳ
	@SuppressWarnings("unused")
	private boolean isLastPage;  //�Ƿ�Ϊ���һҳ
	@SuppressWarnings("unused") 
	private boolean hasPreviousPage;  //�Ƿ���ǰһҳ
	@SuppressWarnings("unused")  
	private boolean hasNextPage; //�Ƿ�����һҳ
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
	//��ʼ����ҳ��Ϣ
	public void init(){
		this.isFirstPage = isFirstPage();
		this.isLastPage = isLastPage();
		this.hasPreviousPage = isHasPreviousPage();
        this.hasNextPage = isHasNextPage();
        System.out.println("bbbbbbbbbbb");
	}

	/**
	 * ������ҳ��,��̬����,���ⲿֱ��ͨ����������
	 * @param pageSize  ÿҳ��¼��
	 * @param allRow  �ܼ�¼��
	 * @return  ��ҳ��
���� */
	public static int countTotalPage(final int pageSize,final int allRow){
		int totalPage = allRow % pageSize == 0 ? allRow/pageSize : allRow/pageSize+1;
		return totalPage;
	}
	/**
	 * ���㵱ǰҳ��ʼ��¼
	 * @param pageSize  ÿҳ��¼��
	 * @param currentPage  ��ǰ�ڼ�ҳ
	 * @return ��ǰҳ��ʼ��¼��
	 */
	public static int countOffset(final int pageSize,final int currentPage){
		final int offset = pageSize * (currentPage-1);
		return offset;
	}
	/**
	 * ���㵱ǰҳ,��Ϊ0���������URL��û��"?page=",����1����
	 * @param page  ����Ĳ���(����Ϊ��,��0,�򷵻�1)
	 * @return  ��ǰҳ
	 */
	public static int countCurrentPage(int page){
		final int curPage = (page==0?1:page);
		return curPage;
	}
}
