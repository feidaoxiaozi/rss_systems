/*
MySQL Data Transfer
Source Host: localhost
Source Database: rss_system
Target Host: localhost
Target Database: rss_system
Date: 2013-2-25 17:59:45
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for rsslist
-- ----------------------------
DROP TABLE IF EXISTS `rsslist`;
CREATE TABLE `rsslist` (
  `newsId` int(11) NOT NULL auto_increment,
  `title` varchar(200) default NULL,
  `URL` varchar(200) default NULL,
  `resource` varchar(100) default NULL,
  `time` datetime default NULL,
  `attention` int(100) default NULL,
  `classes` int(50) default NULL,
  PRIMARY KEY  (`newsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `rsslist` VALUES ('18283', '国际新闻：安倍与朴槿惠套近乎，韩媒：很别扭', 'http://xmwww.com/fj/shidian/163895.html', '厦门热线', '2013-02-25 17:23:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18284', '朴槿惠就职李明博时代谢幕 敦促朝鲜弃核', 'http://www.cb.com.cn/1634427/20130225/448639.html', '中国经营网', '2013-02-25 17:20:00', '1837', '5');
INSERT INTO `rsslist` VALUES ('18285', '新闻背景：韩国首位女总统朴槿惠', 'http://news.v1.cn/world/2013-2-25/246357v.shtml', '第一视频', '2013-02-25 17:14:00', '1837', '5');
INSERT INTO `rsslist` VALUES ('18286', '安倍访美软硬兼施“话术了得”', 'http://news.v1.cn/mil/2013-2-25/246081v-1.shtml', '第一视频', '2013-02-25 17:14:00', '4238', '5');
INSERT INTO `rsslist` VALUES ('18287', '阿总统下令驱逐部分美特种部队', 'http://v.cqnews.net/first/2013-02/25/content_24734574.htm', '华龙网', '2013-02-25 17:06:00', '170', '5');
INSERT INTO `rsslist` VALUES ('18288', '韩国总统朴槿惠唱歌视频罕见曝光', 'http://v.china.com.cn/news/2013-02/25/content_28055085.htm', '中国网视频频道', '2013-02-25 16:56:00', '1837', '5');
INSERT INTO `rsslist` VALUES ('18289', '外交部向朴槿惠正式就职表示祝贺 愿与韩方深化关系', 'http://www.chinadaily.com.cn/hqzx/2013-02/25/content_16254754.htm', '中国日报网', '2013-02-25 16:49:00', '1837', '5');
INSERT INTO `rsslist` VALUES ('18290', '中美中产比幸福：美国食品服装等必需品十年未涨价', 'http://www.s1979.com/news/china/201302/2577531425.shtml', '中国时刻网', '2013-02-25 16:23:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18291', '日本副首相麻生将与朴槿惠会谈', 'http://www.csstoday.net/Item/50563.aspx', '中国社会科学在线', '2013-02-25 16:15:00', '43', '5');
INSERT INTO `rsslist` VALUES ('18292', '俄总统顾问格拉季耶夫或成下任央行行长', 'http://news.xhby.net/system/2013/02/25/016360677.shtml', '新华报业网', '2013-02-25 16:08:00', '2', '5');
INSERT INTO `rsslist` VALUES ('18293', '普京三任外交启动', 'http://www.csstoday.net/Item/50556.aspx', '中国社会科学在线', '2013-02-25 15:57:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18294', '奥巴马夫人出演脱口秀 激情热跳“妈妈舞”', 'http://news.v1.cn/world/2013-2-25/245996v-1.shtml', '第一视频', '2013-02-25 15:05:00', '184', '5');
INSERT INTO `rsslist` VALUES ('18295', '挺美靠中拉日俄 刚柔朴槿惠少说多做', 'http://international.caixun.com/kejx/20130225-CX03aj2i.html', '财讯', '2013-02-25 14:45:00', '1837', '5');
INSERT INTO `rsslist` VALUES ('18296', '朴槿惠“登基” 东北亚关键人物惺惺相惜', 'http://international.caixun.com/zhengzhen/20130225-CX03aj0d.html', '财讯', '2013-02-25 14:12:00', '1837', '5');
INSERT INTO `rsslist` VALUES ('18297', '德国总理访问土耳其 增大土加入欧盟希望', 'http://overseas.caijing.com.cn/2013-02-25/112527490.html', '财经网', '2013-02-25 12:55:00', '119', '5');
INSERT INTO `rsslist` VALUES ('18298', '德国总理谨慎使用社交媒体 发言人代笔互动', 'http://www.gmw.cn/media/2013-02/25/content_6804884.htm', '光明网', '2013-02-25 12:07:00', '3', '5');
INSERT INTO `rsslist` VALUES ('18299', '韩国男子切腹抗议日本新首相安倍晋三的特使团', 'http://city.sz.net.cn/city/2013-02/25/content_3134944.htm', '深圳之窗', '2013-02-25 11:39:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18300', '杜平:李明博执政无力 将对放任朝核试负责', 'http://cen.ce.cn/more/201302/25/t20130225_24140909.shtml', '中国经济网', '2013-02-25 11:22:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18301', '盘点美国最富总统 奥巴马资产仅为克林顿1/8', 'http://www.nbd.com.cn/articles/2013-02-25/716608.html', '每经网', '2013-02-25 10:56:00', '7', '5');
INSERT INTO `rsslist` VALUES ('18302', '[短讯]日本内阁房长官菅义伟：首相安倍晋三尚未..', 'http://finance.sina.com.cn/money/forex/20130225/104614636128.shtml', '新浪', '2013-02-25 10:46:00', '318', '5');
INSERT INTO `rsslist` VALUES ('18303', '贝卢斯科尼参与大选投票 遭遇裸露女子抗议(图)', 'http://news.xinhuanet.com/world/2013-02/25/c_114788744.htm', '新华网', '2013-02-25 10:24:00', '677', '5');
INSERT INTO `rsslist` VALUES ('18304', '外电：美国第一夫人引领时尚潮流', 'http://world.cankaoxiaoxi.com/2013/0225/169616.shtml', '参考消息', '2013-02-25 10:22:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18305', '安倍晋三访美前公园长跑 高调出镜显示身体健康', 'http://news.youth.cn/zc/tyzhzx/201302/t20130225_2904864.htm', '中国青年网', '2013-02-25 09:32:00', '4238', '5');
INSERT INTO `rsslist` VALUES ('18306', '普京向俄共十五大发贺信', 'http://news.xinhuanet.com/world/2013-02/25/c_124383098.htm', '新华网', '2013-02-25 09:26:00', '94', '5');
INSERT INTO `rsslist` VALUES ('18307', '在亚洲站稳脚步后 美国战略轴心将重返欧洲', 'http://world.people.com.cn/n/2013/0225/c157278-20588658.html', '人民网', '2013-02-25 09:25:00', '226', '5');
INSERT INTO `rsslist` VALUES ('18308', '韩新总统朴槿惠正式上任 最先检验军方安保', 'http://overseas.caijing.com.cn/2013-02-25/112526719.html', '财经网', '2013-02-25 09:11:00', '1837', '5');
INSERT INTO `rsslist` VALUES ('18309', '美国白宫就将春节列为节假日请愿做出回应', 'http://news.kunming.cn/wd-news/content/2013-02/25/content_3217320.htm', '昆明信息港', '2013-02-25 09:11:00', '53', '5');
INSERT INTO `rsslist` VALUES ('18310', '专家称韩国新任总统朴槿惠将着力发展对华关系', 'http://news.xhby.net/system/2013/02/25/016352274.shtml', '新华报业网', '2013-02-25 09:07:00', '1837', '5');
INSERT INTO `rsslist` VALUES ('18311', '韩国新任总统朴槿惠正式上任', 'http://world.people.com.cn/n/2013/0225/c1002-20586765.html', '人民网', '2013-02-25 08:58:00', '1837', '5');
INSERT INTO `rsslist` VALUES ('18312', '全球女政要衣着:英拉居首希拉里第6(组图)', 'http://int.gmw.cn/2013-02/25/content_6800182.htm', '光明网', '2013-02-25 08:42:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18313', '美法院受理三一重工诉奥巴马案', 'http://www.chinadaily.com.cn/hqcj/zgjj/2013-02-25/content_8338579.html', '中国日报网', '2013-02-25 08:31:00', '611', '5');
INSERT INTO `rsslist` VALUES ('18314', '李明博时代即将谢幕 私宅将设指挥网严密监视朝', 'http://www.news365.com.cn/xwzx/gj/201302/t20130225_971995.html', '文新传媒', '2013-02-25 08:19:00', '1837', '5');
INSERT INTO `rsslist` VALUES ('18315', '第一资讯：韩国第18届总统就任仪式举行', 'http://www.chinadaily.com.cn/hqgj/jryw/2013-02-25/content_8338371.html', '中国日报网', '2013-02-25 08:12:00', '3', '5');
INSERT INTO `rsslist` VALUES ('18316', '陆克文：中国强势促美重返亚洲', 'http://news.xinhuanet.com/world/2013-02/25/c_124381772.htm', '新华网', '2013-02-25 08:02:00', '64', '5');
INSERT INTO `rsslist` VALUES ('18317', '意大利选总理市场怎么看？', 'http://finance.ifeng.com/gold/glsc/20130225/7696604.shtml', '凤凰网', '2013-02-25 08:01:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18318', '意大利：昨起举行议会大选 贝卢斯科尼不被看好', 'http://www.chinanews.com/shipin/2013/02-25/news178067.shtml', '中国新闻网', '2013-02-25 07:54:00', '677', '5');
INSERT INTO `rsslist` VALUES ('18319', '萌 奥巴马夫人“热舞”', 'http://news.enorth.com.cn/system/2013/02/25/010667550.shtml', '北方网', '2013-02-25 07:06:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18320', 'アベノミクスが进行急速な�安は�刃の�', 'http://news.xinmin.cn/world/2013/02/24/18808766.html', '新民网', '2013-02-24 23:17:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18321', '俄总理称眼下正调查大约五万起腐败案件', 'http://roll.sohu.com/20130224/n366873540.shtml', '搜狐', '2013-02-24 22:44:00', '2', '5');
INSERT INTO `rsslist` VALUES ('18322', '2月25日：金大中就任韩国第15任总统', 'http://news.jxnews.com.cn/system/2013/02/24/012299679.shtml', '大江网', '2013-02-24 21:48:00', '1837', '5');
INSERT INTO `rsslist` VALUES ('18323', '法国：总统奥朗德私生活被搬上舞台', 'http://www.chinanews.com/shipin/2013/02-24/news177917.shtml', '中国新闻网', '2013-02-24 19:37:00', '47', '5');
INSERT INTO `rsslist` VALUES ('18324', '刘延东会见韩国总统李明博', 'http://news.xinhuanet.com/world/2013-02/24/c_114782029.htm', '新华网', '2013-02-24 18:12:00', '69', '5');
INSERT INTO `rsslist` VALUES ('18325', '奥巴马夫人与男扮女装主持人跳“妈妈舞”爆红', 'http://news.youth.cn/gj/201302/t20130224_2903320.htm', '中国青年网', '2013-02-24 15:22:00', '184', '5');
INSERT INTO `rsslist` VALUES ('18326', '贝卢斯科尼传奇历程：上法庭超过2500次(图)', 'http://news.bandao.cn/news_html/201302/20130224/news_20130224_2082606.shtml', '半岛网', '2013-02-24 13:56:00', '3', '5');
INSERT INTO `rsslist` VALUES ('18327', '朝鲜发布“火烧奥巴马”宣传片 白宫指其挑衅', 'http://news.86516.com/junshi/h006/h53/653553.shtml', '彭城视窗', '2013-02-24 10:23:00', '2', '5');
INSERT INTO `rsslist` VALUES ('18328', '美国刻意低调 安倍访美遇冷', 'http://he.people.com.cn/n/2013/0224/c338616-18203723.html', '人民网', '2013-02-24 09:56:00', '4238', '5');
INSERT INTO `rsslist` VALUES ('18329', '俄罗斯举行祖国保卫者日纪念活动', 'http://world.kankanews.com/qita/2013-02-24/2454082.shtml', '看看新闻网', '2013-02-24 07:35:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18330', '从拾荒少年到总统 李明博神话谢幕', 'http://roll.sohu.com/20130224/n366836246.shtml', '搜狐', '2013-02-24 03:55:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18331', '查韦斯曾在联大会高呼美国佬滚 推崇毛泽东思想', 'http://news.cn.yahoo.com/ypen/20130224/1620713.html?f=E114_1_1', '雅虎', '2013-02-24 02:26:00', '456', '5');
INSERT INTO `rsslist` VALUES ('18332', '俄罗斯总理访问古巴 出售8架总价值6.5亿美元飞机', 'http://news.youth.cn/gj/201302/t20130224_2902164.htm', '中国青年网', '2013-02-24 01:52:00', '330', '5');
INSERT INTO `rsslist` VALUES ('18333', '安倍称近期将举行日美反恐对策磋商', 'http://news.66wz.com/system/2013/02/23/103547796.shtml', '温州网', '2013-02-23 15:28:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18334', '日美首脑会谈花絮：安倍与奥巴马视线交汇次数少', 'http://news.xhby.net/system/2013/02/23/016343865.shtml', '新华报业网', '2013-02-23 15:21:00', '4238', '5');
INSERT INTO `rsslist` VALUES ('18335', '美日有意争取安理会通过针对朝鲜的决议', 'http://www.csstoday.net/Item/50209.aspx', '中国社会科学在线', '2013-02-23 14:47:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18336', '美国总统性丑闻史：开国元勋杰弗逊与女奴生育6子', 'http://news.dahe.cn/2013/02-23/102002023.html', '大河网', '2013-02-23 10:58:00', '4', '5');
INSERT INTO `rsslist` VALUES ('18337', '财崖下周再杀到 美府院爆口水战', 'http://news.takungpao.com/world/focus/2013-02/1454462.html', '大公网', '2013-02-23 10:02:00', '188', '5');
INSERT INTO `rsslist` VALUES ('18338', '黑客入侵布什家族电脑：电邮私密照片曝光', 'http://www.citnews.com.cn/important/201302/172180.html', 'CitNews科技资讯网', '2013-02-23 09:10:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18339', '印总理抨击连环爆炸案是“卑鄙攻击” 吁民众克制', 'http://overseas.caijing.com.cn/2013-02-23/112523963.html', '财经网', '2013-02-23 02:50:00', '371', '5');
INSERT INTO `rsslist` VALUES ('18340', '美“黑客报告”疑点重重 更似自导自演？', 'http://world.kankanews.com/qita/2013-02-23/2449496.shtml', '看看新闻网', '2013-02-22 23:51:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18341', '突尼斯总统任命新总理', 'http://news.xinhuanet.com/2013-02/22/c_124378173.htm', '新华网', '2013-02-22 23:42:00', '34', '5');
INSERT INTO `rsslist` VALUES ('18342', '普京希望俄乌之间的所有矛盾均得到解决', 'http://www.csstoday.net/Item/50101.aspx', '中国社会科学在线', '2013-02-22 23:41:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18343', '安倍再次抛出反华言论 如今日本为何一右再右？', 'http://gb.cri.cn/27824/2013/02/22/6651s4028275.htm', '国际在线', '2013-02-22 21:29:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18344', '日本22日举行“竹岛日”活动：韩国内多地举行抗..', 'http://world.kankanews.com/focus/2013-02-22/2446764.shtml', '看看新闻网', '2013-02-22 17:26:00', '990', '5');
INSERT INTO `rsslist` VALUES ('18345', '国际晚班车（2月22日）：克里将首访欧洲中东', 'http://news.xinhuanet.com/world/2013-02/22/c_124377772_2.htm', '新华网', '2013-02-22 16:58:00', '44', '5');
INSERT INTO `rsslist` VALUES ('18346', '梅德韦杰夫驳斥俄系专制国家 称此观点不严肃', 'http://overseas.caijing.com.cn/2013-02-22/112523119.html', '财经网', '2013-02-22 15:55:00', '26', '5');
INSERT INTO `rsslist` VALUES ('18347', '港刊：美首位女总统?国务卿恐为希拉里最大成就', 'http://hm.people.com.cn/n/2013/0222/c42272-20571467.html', '人民网', '2013-02-22 15:06:00', '30', '5');
INSERT INTO `rsslist` VALUES ('18348', '日首相特使同俄总统会面提岛争', 'http://news.v1.cn/world/2013-2-22/238828v.shtml', '第一视频', '2013-02-22 12:24:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18349', '李明博移交1088万余份工作记录', 'http://world.people.com.cn/n/2013/0222/c1002-20569392.html', '人民网', '2013-02-22 11:24:00', '7', '5');
INSERT INTO `rsslist` VALUES ('18350', '朝鲜“火烧”奥巴马 美朝都在威逼中国', 'http://international.caixun.com/wkp/20130222-CX03ahpi.html', '财讯', '2013-02-22 11:20:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18351', '美国谴责朝鲜反美宣传片火烧奥巴马', 'http://v.xiancity.cn/video/events/detail_2013_02/22/68611_0.shtml', '西安网', '2013-02-22 10:58:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18352', '奥巴马或将提名布里德洛夫为北约欧洲盟军最高司令', 'http://news.ifeng.com/world/detail_2013_02/22/22383190_0.shtml', '凤凰网', '2013-02-22 10:20:00', '3', '5');
INSERT INTO `rsslist` VALUES ('18353', '1732年2月22日 美国第一届总统华盛顿诞辰', 'http://news.ifeng.com/history/today/detail_2013_02/22/22382266_0.shtml', '凤凰网', '2013-02-22 10:06:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18354', '韩国2月25日就任日的0~12点国政将处于空白状态', 'http://www.csstoday.net/Item/49913.aspx', '中国社会科学在线', '2013-02-22 09:52:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18355', '美国介入亚洲 可充当离岸稳定要素', 'http://www.csstoday.net/Item/49907.aspx', '中国社会科学在线', '2013-02-22 09:49:00', '3', '5');
INSERT INTO `rsslist` VALUES ('18356', '篮球恶搞: 500年了，还没人带猴子去打CBA吗？', 'http://sports.kankanews.com/cba/2013-02-22/502185.shtml', '看看新闻网', '2013-02-22 09:27:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18357', '美国对华风能、太阳能技术发起“挑战”', 'http://guangfu.bjx.com.cn/news/20130222/418923.shtml', '北极星太阳能光伏网', '2013-02-22 09:16:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18358', '颁奖季男明星集体蓄络腮胡引发时尚热潮', 'http://ent.kankanews.com/qita/2013-02-22/2443643.shtml', '看看新闻网', '2013-02-22 08:48:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18359', '漫画（20130222）', 'http://www.dfdaily.com/html/51/2013/2/22/950057.shtml', '东方早报', '2013-02-22 02:41:00', '2', '5');
INSERT INTO `rsslist` VALUES ('18360', '“我不会对你们说谎”', 'http://roll.sohu.com/20130222/n366690610.shtml', '搜狐', '2013-02-22 02:35:00', '0', '5');
INSERT INTO `rsslist` VALUES ('18361', '视频：外交部称中国新任国家主席将访问俄罗斯', 'http://video.sina.com.cn/p/news/c/v/2013-02-21/192862074005.html', '新浪', '2013-02-21 19:28:00', '11', '5');
INSERT INTO `rsslist` VALUES ('18362', '历任英国首相外访团最大阵容访问印度', 'http://news.joy.cn/video/4252612.htm', '激动网', '2013-02-21 07:59:00', '119', '5');
