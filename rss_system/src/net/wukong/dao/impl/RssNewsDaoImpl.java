package net.wukong.dao.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import net.wukong.dao.DataTransfer;
import net.wukong.dao.RssNewsDao;
import net.wukong.rssnews.RssNews;
import net.wukong.snatch.GetNewsFromNet;
import net.wukong.util.DBConn;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class RssNewsDaoImpl extends HibernateDaoSupport implements RssNewsDao,
		DataTransfer {
   
	public static List<HashMap<String, Object>> data = new ArrayList<HashMap<String, Object>>();
	private int param = 0;
	
	DBConn db = new DBConn();
	Connection con = db.getConn();
	PreparedStatement ps = null, ps1 = null, ps2 = null;
	ResultSet rs = null;

//	 @SuppressWarnings("unchecked")
//	 public List<RssNews> findAllRssNews() {
//	 int parameter = getParam();
//	 String hql = "from RssNews r where r.attention>1 and r.classes="+parameter;
//			
//	 System.out.println("$%^$%^$%^" + parameter);
//	 return this.getHibernateTemplate().find(hql);
//	 }

	public void loadRssNewsData(int param) {
		this.param = param;

		String sql = "insert into rsslist (newsId,title,url,resource,time,attention,classes)values(?,?,?,?,?,?,?)";

		try {
			con.setAutoCommit(false);
			ps = (PreparedStatement) con.prepareStatement(sql,
					Statement.RETURN_GENERATED_KEYS);

			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
			for (HashMap<String, Object> map : data) {
				int n = 0, index = 0;
				String stratten = (String) map.get(ATTENTION);
				if (null == stratten) {
					stratten = "0";
				}
				int attention = Integer.parseInt(stratten);
				String newtime = null;
				Calendar c = Calendar.getInstance();// 可以对每个时间域单独修改
				int year = c.get(Calendar.YEAR);
				int month = c.get(Calendar.MONTH);
				int date = c.get(Calendar.DATE);
				int second = c.get(Calendar.SECOND);
				String overtime = (String) map.get(TIME);
				if (overtime.contains("-")) {
					newtime = String.valueOf(year) + "-" + overtime+":"+String.valueOf(second);
				} else {
					newtime = String.valueOf(year) + "-"
							+ String.valueOf(month + 1) + "-"
							+ String.valueOf(date) + " " + overtime+":"+String.valueOf(second);
				}

				java.util.Date gooddate = null;
				Timestamp time = null;
				try {
					gooddate = df.parse(newtime);
					time = new Timestamp(gooddate.getTime());

				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
					ps.setInt(1, index++);
					ps.setString(2, (String) map.get(TITLE));
					ps.setString(3, (String) map.get(URL));
					ps.setString(4, (String) map.get(FROM));
					ps.setTimestamp(5, time);
					ps.setInt(6, attention);
					ps.setInt(7, param);
					ps.addBatch();			
				    n++;
				if (n > 100) {
					ps.executeBatch();
					n = 0;
				}
				ps.executeBatch();
				con.commit();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (null != rs) {
					rs.close();
				}
				if (null != ps) {
					ps.close();
				}
				if (null != ps1) {
					ps1.close();
				}
				if (null != ps2) {
					ps2.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	GetNewsFromNet gnfn = new GetNewsFromNet();

	public void loadSzywNews(RssNews rssNews) {

		try {
			gnfn.getSzyw();
			loadRssNewsData(1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void loadTWNews(RssNews rssNews) {

		try {
			gnfn.getTaiwNews();
			loadRssNewsData(2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void loadGangAoNews(RssNews rssNews) {
		// GetNewsFromGangAo gangAo = new GetNewsFromGangAo();
		try {
			gnfn.getGangAo();
			loadRssNewsData(3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void loadHqsyNews(RssNews rssNews) {

		try {
			gnfn.getHqsy();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(4);
	}

	public void loadGjrwNews(RssNews rssNews) {

		try {
			gnfn.getGjrw();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(5);

	}

	public void loadZgjqNews(RssNews rssNews) {

		try {
			gnfn.getZgjq();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(6);

	}

	public void loadThjjNews(RssNews rssNews) {

		try {
			gnfn.getThjj();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(7);

	}

	public void loadGjjqNews(RssNews rssNews) {

		try {
			gnfn.getGjjq();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(8);

	}

	public void loadGuPiaoNews(RssNews rssNews) {

		try {
			gnfn.getGuPiao();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(9);

	}

	public void loadLiCaiNews(RssNews rssNews) {

		try {
			gnfn.getLiCai();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(10);

	}

	public void loadJjmsNews(RssNews rssNews) {

		try {
			gnfn.getJjms();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(11);

	}

	public void loadRwdtNews(RssNews rssNews) {

		try {
			gnfn.getRwdt();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(12);

	}

	public void loadGsdtNews(RssNews rssNews) {

		try {
			gnfn.getGsdt();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(13);

	}

	public void loadSsyqNews(RssNews rssNews) {

		try {
			gnfn.getSsyq();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(14);
	}

	public void loadDzswNews(RssNews rssNews) {

		try {
			gnfn.getDzsw();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(15);
	}

	public void loadWlyxNews(RssNews rssNews) {

		try {
			gnfn.getWlyx();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(16);
	}

	public void loadHlwplNews(RssNews rssNews) {

		try {
			gnfn.getHlwpl();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(17);
	}

	public void loadGddtNews(RssNews rssNews) {

		try {
			gnfn.getGsdt();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(18);

	}

	public void loadZcfxNews(RssNews rssNews) {

		try {
			gnfn.getZcfx();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(19);

	}

	public void loadSczsNews(RssNews rssNews) {

		try {
			gnfn.getSczs();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(20);

	}

	public void loadJiaJuNews(RssNews rssNews) {

		try {
			gnfn.getJiaJu();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(21);

	}

	public void loadFcplNews(RssNews rssNews) {

		try {
			gnfn.getFcpl();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(22);
	}

	public void loadFczxNews(RssNews rssNews) {

		try {
			gnfn.getFczx();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(23);

	}

	public void loadFcjdNews(RssNews rssNews) {

		try {
			gnfn.getFcjd();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(24);

	}

	public void loadXinCheNews(RssNews rssNews) {

		try {
			gnfn.getXinChe();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(25);

	}

	public void loadDaoGouNews(RssNews rssNews) {

		try {
			gnfn.getDaoGou();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(26);

	}

	public void loadGdhqNews(RssNews rssNews) {

		try {
			gnfn.getGdhq();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(27);

	}

	public void loadWxyhNews(RssNews rssNews) {

		try {
			gnfn.getWxyh();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(28);

	}

	public void loadNBANews(RssNews rssNews) {

		try {
			gnfn.getNBA();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(29);

	}

	public void loadGjzqNews(RssNews rssNews) {

		try {
			gnfn.getGjzq();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(30);

	}

	public void loadGnzqNews(RssNews rssNews) {

		try {
			gnfn.getGnzq();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(31);

	}

	public void loadCBANews(RssNews rssNews) {

		try {
			gnfn.getCBA();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(32);

	}

	public void loadZhtyNews(RssNews rssNews) {

		try {
			gnfn.getZhty();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(33);

	}

	public void loadAoYunNews(RssNews rssNews) {

		try {
			gnfn.getAoYun();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(34);

	}

	public void loadMingXNews(RssNews rssNews) {

		try {
			gnfn.getMingX();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(35);

	}

	public void loadDianYNews(RssNews rssNews) {

		try {
			gnfn.getDianY();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(36);

	}

	public void loadDianshNews(RssNews rssNews) {

		try {
			gnfn.getDiansh();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(37);

	}

	public void loadMusicNews(RssNews rssNews) {

		try {
			gnfn.getMusic();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(38);

	}

	public void loadZongYiNews(RssNews rssNews) {

		try {
			gnfn.getZongYi();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(39);

	}

	public void loadYanChuNews(RssNews rssNews) {

		try {
			gnfn.getYanChu();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(40);

	}

	public void loadJiangXNews(RssNews rssNews) {

		try {
			gnfn.getJiangX();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(41);

	}

	public void loadWangYNews(RssNews rssNews) {

		try {
			gnfn.getWangY();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(42);

	}

	public void loadTvGamesNews(RssNews rssNews) {

		try {
			gnfn.getTvGames();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(43);

	}

	public void loadDzjjNews(RssNews rssNews) {

		try {
			gnfn.getDzjj();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(44);

	}

	public void loadHotYxNews(RssNews rssNews) {

		try {
			gnfn.getHotYx();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(45);

	}

	public void loadMssjNews(RssNews rssNews) {

		try {
			gnfn.getMssj();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(46);

	}

	public void loadKaoShiNews(RssNews rssNews) {

		try {
			gnfn.getKaoShi();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(47);

	}

	public void loadLiuXueNews(RssNews rssNews) {

		try {
			gnfn.getLiuXue();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(48);

	}

	public void loadJiuYeNews(RssNews rssNews) {

		try {
			gnfn.getJiuYe();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(49);

	}

	public void loadClfsNews(RssNews rssNews) {

		try {
			gnfn.getClfs();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(50);

	}

	public void loadMrhfNews(RssNews rssNews) {

		try {
			gnfn.getMrhf();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(51);

	}

	public void loadJfjsNews(RssNews rssNews) {

		try {
			gnfn.getJfjs();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(52);

	}

	public void loadQglxNews(RssNews rssNews) {

		try {
			gnfn.getQglx();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(53);

	}

	public void loadJkysNews(RssNews rssNews) {

		try {
			gnfn.getJkys();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(54);

	}

	public void loadShouJiNews(RssNews rssNews) {

		try {
			gnfn.getShouJi();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(55);

	}

	public void loadShuMaNews(RssNews rssNews) {

		try {
			gnfn.getShuMa();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(56);

	}

	public void loadDianNaoNews(RssNews rssNews) {

		try {
			gnfn.getDianNao();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(57);

	}

	public void loadKePuNews(RssNews rssNews) {

		try {
			gnfn.getKePu();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(58);

	}

	public void loadKjqtNews(RssNews rssNews) {

		try {
			gnfn.getKjqt();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(59);

	}

	public void loadYeJieNews(RssNews rssNews) {

		try {
			gnfn.getYeJie();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(60);

	}

	public void loadJiaDianNews(RssNews rssNews) {
		// GetNewsFromJiaDian jiadian= new GetNewsFromJiaDian();
		try {
			gnfn.getJiaDian();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(61);

	}

	public void loadKptpNews(RssNews rssNews) {
		// GetNewsFromKptp kxtp= new GetNewsFromKptp();
		try {
			gnfn.getKptp();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(62);

	}

	public void loadKxspNews(RssNews rssNews) {
		// GetNewsFromKxsp kxsp= new GetNewsFromKxsp();
		try {
			gnfn.getKxsp();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(63);

	}

	public void loadKjjdNews(RssNews rssNews) {

		try {
			gnfn.getKjjd();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(64);

	}

	public void loadShyfNews(RssNews rssNews) {

		try {
			gnfn.getShyf();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(65);

	}

	public void loadShwxNews(RssNews rssNews) {

		try {
			gnfn.getShwx();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(66);

	}

	public void loadZqskNews(RssNews rssNews) {

		try {
			gnfn.getZqsk();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(67);

	}

	public void loadQwysNews(RssNews rssNews) {

		try {
			gnfn.getQwys();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loadRssNewsData(68);

	}

	public int getParam() {
		return param;
	}

	public void setParam(int param) {
		this.param = param;
	}

	public ArrayList<RssNews> getUrl() {
		ArrayList<RssNews> al = new ArrayList<RssNews>();
		Statement st = null;
		ResultSet rs = null;
		con = db.getConn();
		String sql = "select * from rsslist";
		try {
			st = (Statement) con.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				RssNews rssNews = new RssNews();
				rssNews.setNewsId(rs.getInt(1));
				rssNews.setTitle(rs.getString(2));
				rssNews.setUrl(rs.getString(3));
				rssNews.setResource(rs.getString(4));
				rssNews.setTime(rs.getTimestamp(5));
				rssNews.setAttention(rs.getInt(6));
				rssNews.setClasses(rs.getInt(7));
				al.add(rssNews);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.close();
		}
		return al;
	}

	public int getAllRowCount(String hql) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find(hql).size();
	}
	@SuppressWarnings("unchecked")
	public List queryForPage(final String hql, final int offset,
			final int length) {
		List list = getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery(hql);
				query.setFirstResult(offset);
				query.setMaxResults(length);
				List list = query.list();
				Set set = new HashSet();	
				List newList = new ArrayList();	
				 for (Iterator iter = list.iterator(); iter.hasNext();) {				
			            Object element = iter.next();					
			            if (set.add(element))					
			                newList.add(element);					
			        }			
				return newList;
			}
		});
		return list;
	}
	@SuppressWarnings("unchecked")
	public List queryForTitle(final String hql, final int offset,
			final int length,String keyWords,Timestamp smallTime,Timestamp bigTime,int bigAttention) {
		List list = getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery(hql);
				query.setFirstResult(offset);
				query.setMaxResults(length);
				List list = query.list();
				
				return list;
			}
		});
		return list;
	}
	public String getParameter() {
		int parameter = getParam();
		System.out.println("parameter%^&%^&&^*&="+parameter);	
		String hql = "from RssNews r where r.attention>1 and r.classes="+parameter;
		return hql;
	}
}
