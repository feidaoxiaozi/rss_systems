package net.wukong.snatch;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import net.wukong.util.ParserTest;

public class GetNewsFromNet extends ParserTest{
	public String getAoYun() throws IOException {
		String aoyunUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				aoyunUrl = "http://news.baidu.com/n?cmd=4&class=aoyun&pn=1";
			}if(i==2){
				aoyunUrl = "http://news.baidu.com/n?cmd=4&class=aoyun&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(aoyunUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getCBA() throws IOException {
		String cbaUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				cbaUrl = "http://news.baidu.com/n?cmd=4&class=cba&pn=1";
			}if(i==2){
				cbaUrl = "http://news.baidu.com/n?cmd=4&class=cba&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(cbaUrl).get();
		 getDoc(doc);

		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getClfs() throws IOException { 
		String clfsUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				clfsUrl = "http://news.baidu.com/n?cmd=4&class=chaoliufs&pn=1";
			}if(i==2){
				clfsUrl = "http://news.baidu.com/n?cmd=4&class=chaoliufs&pn=2&sub=0";
			}
		
		 Document doc = Jsoup.connect(clfsUrl).get();	
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getDaoGou() throws IOException { 
		String daogouUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				daogouUrl = "http://news.baidu.com/n?cmd=4&class=daogou&pn=1";
			}if(i==2){
				daogouUrl = "http://news.baidu.com/n?cmd=4&class=daogou&pn=2&sub=0";
			}
		
		 Document doc = Jsoup.connect(daogouUrl).get();
         getDoc(doc);
		
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getDianNao() throws IOException {
		String diannaoUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				diannaoUrl = "http://news.baidu.com/n?cmd=4&class=fqzx&pn=1";
			}if(i==2){
				diannaoUrl = "http://news.baidu.com/n?cmd=4&class=fqzx&pn=2&sub=0";
			}
		
		 Document doc = Jsoup.connect(diannaoUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getDiansh() throws IOException {
		String dianshUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				dianshUrl = "http://news.baidu.com/n?cmd=4&class=tv&pn=1";
			}if(i==2){
				dianshUrl = "http://news.baidu.com/n?cmd=4&class=tv&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(dianshUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getDianY() throws IOException { 
		String dianyUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				dianyUrl = "http://news.baidu.com/n?cmd=4&class=film&pn=1";
			}if(i==2){
				dianyUrl = "http://news.baidu.com/n?cmd=4&class=film&pn=2&sub=0";
			}		
		 Document doc = Jsoup.connect(dianyUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getDzjj() throws IOException {
		String dzjjUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				dzjjUrl = "http://news.baidu.com/n?cmd=4&class=dianzijingji&pn=1";
			}if(i==2){
				dzjjUrl = "http://news.baidu.com/n?cmd=4&class=dianzijingji&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(dzjjUrl).get();
            getDoc(doc);  
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getDzsw() throws IOException {
		String dzswUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				dzswUrl = "http://news.baidu.com/n?cmd=4&class=e_commerce&pn=1";
			}if(i==2){
				dzswUrl = "http://news.baidu.com/n?cmd=4&class=e_commerce&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(dzswUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getFcjd() throws IOException {
		String fcjdUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				fcjdUrl = "http://news.baidu.com/n?cmd=4&class=estateFocus&pn=1";
			}if(i==2){
				fcjdUrl = "http://news.baidu.com/n?cmd=4&class=estateFocus&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(fcjdUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getFcpl() throws IOException { 
		String fcplUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				fcplUrl = "http://news.baidu.com/n?cmd=4&class=houseval&pn=1";
			}if(i==2){
				fcplUrl = "http://news.baidu.com/n?cmd=4&class=houseval&pn=2&sub=0";
			}		
		 Document doc = Jsoup.connect(fcplUrl).get();	
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getFczx() throws IOException {
		String fczxUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				fczxUrl = "http://news.baidu.com/n?cmd=4&class=fqzx&pn=1";
			}if(i==2){
				fczxUrl = "http://news.baidu.com/n?cmd=4&class=fqzx&pn=2&sub=0";
			}		
		 Document doc = Jsoup.connect(fczxUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getGangAo() throws IOException {
		String gangAoUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				gangAoUrl = "http://news.baidu.com/n?cmd=4&class=gangaotai&pn=1";
			}if(i==2){
				gangAoUrl = "http://news.baidu.com/n?cmd=4&class=gangaotai&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(gangAoUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getGddt() throws IOException {
		String gddtUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				gddtUrl = "http://news.baidu.com/n?cmd=4&class=gddt&pn=1";
			}if(i==2){
				gddtUrl = "http://news.baidu.com/n?cmd=4&class=gddt&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(gddtUrl).get();	
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getGdhq() throws IOException {
		String gdhqUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				gdhqUrl = "http://news.baidu.com/n?cmd=4&class=hangqing&pn=1";
			}if(i==2){
				gdhqUrl = "http://news.baidu.com/n?cmd=4&class=hangqing&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(gdhqUrl).get();	
		 getDoc(doc);
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getGjjq() throws IOException {
		String gjjqUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				gjjqUrl = "http://news.baidu.com/n?cmd=4&class=guojijq&pn=1";
			}if(i==2){
				gjjqUrl = "http://news.baidu.com/n?cmd=4&class=guojijq&pn=2&sub=0";
			}
		
		 Document doc = Jsoup.connect(gjjqUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getGjrw() throws IOException {
		String gjrwUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				gjrwUrl = "http://news.baidu.com/n?cmd=4&class=renwu&pn=1";
			}if(i==2){
				gjrwUrl = "http://news.baidu.com/n?cmd=4&class=renwu&pn=2&sub=0";
			}
		
		 Document doc = Jsoup.connect(gjrwUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getGjzq() throws IOException {
		String gjzqUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				gjzqUrl = "http://news.baidu.com/n?cmd=4&class=worldsoccer&pn=1";
			}if(i==2){
				gjzqUrl = "http://news.baidu.com/n?cmd=4&class=worldsoccer&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(gjzqUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getSzyw() throws IOException {
		String szywUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				szywUrl = "http://news.baidu.com/n?cmd=4&class=shizheng&pn=1";
			}if(i==2){
				szywUrl = "http://news.baidu.com/n?cmd=4&class=shizheng&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(szywUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getGnzq() throws IOException {
		String gnzqUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				gnzqUrl = "http://news.baidu.com/n?cmd=4&class=chinasoccer&pn=1";
			}if(i==2){
				gnzqUrl = "http://news.baidu.com/n?cmd=4&class=chinasoccer&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(gnzqUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getGsdt() throws IOException {
		String gsdtUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				gsdtUrl = "http://news.baidu.com/n?cmd=4&class=gsdt&pn=1";
			}if(i==2){
				gsdtUrl = "http://news.baidu.com/n?cmd=4&class=gsdt&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(gsdtUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getGuPiao() throws IOException {
		String gupiaoUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				gupiaoUrl = "http://news.baidu.com/n?cmd=4&class=stock&pn=1";
			}if(i==2){
				gupiaoUrl = "http://news.baidu.com/n?cmd=4&class=stock&pn=2&sub=0";
			}		
		 Document doc = Jsoup.connect(gupiaoUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getHlwpl() throws IOException {
		String hlwplUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				hlwplUrl = "http://news.baidu.com/n?cmd=4&class=interneteval&pn=1";
			}if(i==2){
				hlwplUrl = "http://news.baidu.com/n?cmd=4&class=interneteval&pn=2&sub=0";
			}		
		 Document doc = Jsoup.connect(hlwplUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getHotYx() throws IOException {
		String hotyxUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				hotyxUrl = "http://news.baidu.com/n?cmd=4&class=remenyouxi&pn=1";
			}if(i==2){
				hotyxUrl = "http://news.baidu.com/n?cmd=4&class=remenyouxi&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(hotyxUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getHqsy() throws IOException {
		String hqsyUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				hqsyUrl = "http://news.baidu.com/n?cmd=4&class=hqsy&pn=1";
			}if(i==2){
				hqsyUrl = "http://news.baidu.com/n?cmd=4&class=hqsy&pn=2&sub=0";
			}
		
		 Document doc = Jsoup.connect(hqsyUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getJfjs() throws IOException { 
		String jfjsUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				jfjsUrl = "http://news.baidu.com/n?cmd=4&class=jianfei&pn=1";
			}if(i==2){
				jfjsUrl = "http://news.baidu.com/n?cmd=4&class=jianfei&pn=2&sub=0";
			}
		
		 Document doc = Jsoup.connect(jfjsUrl).get();
          getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getJiaDian() throws IOException {
		String jiadianUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				jiadianUrl = "http://news.baidu.com/n?cmd=4&class=elec&pn=1";
			}if(i==2){
				jiadianUrl = "http://news.baidu.com/n?cmd=4&class=elec&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(jiadianUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getJiaJu() throws IOException { 
		String jiajuUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				jiajuUrl = "http://news.baidu.com/n?cmd=4&class=fitment&pn=1";
			}if(i==2){
				jiajuUrl = "http://news.baidu.com/n?cmd=4&class=fitment&pn=2&sub=0";
			}
		
		 Document doc = Jsoup.connect(jiajuUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getJiangX() throws IOException {
		String jiangxUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				jiangxUrl = "http://news.baidu.com/n?cmd=4&class=jiangxiang&pn=1";
			}if(i==2){
				jiangxUrl = "http://news.baidu.com/n?cmd=4&class=jiangxiang&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(jiangxUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getJiuYe() throws IOException { 
		String jiuyeUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				jiuyeUrl = "http://news.baidu.com/n?cmd=4&class=hqsy&pn=1";
			}if(i==2){
				jiuyeUrl = "http://news.baidu.com/n?cmd=4&class=hqsy&pn=2&sub=0";
			}
		
		 Document doc = Jsoup.connect(jiuyeUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getJjms() throws IOException {
		String jjmsUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				jjmsUrl = "http://news.baidu.com/n?cmd=4&class=hongguan&pn=1";
			}if(i==2){
				jjmsUrl = "http://news.baidu.com/n?cmd=4&class=hongguan&pn=2&sub=0";
			}
		
		 Document doc = Jsoup.connect(jjmsUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getJkys() throws IOException {
		String jkysUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				jkysUrl = "http://news.baidu.com/n?cmd=4&class=jiankang&pn=1";
			}if(i==2){
				jkysUrl = "http://news.baidu.com/n?cmd=4&class=jiankang&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(jkysUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getKaoShi() throws IOException {
		String kaoshiUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				kaoshiUrl = "http://news.baidu.com/n?cmd=4&class=exams&pn=1";
			}if(i==2){
				kaoshiUrl = "http://news.baidu.com/n?cmd=4&class=exams&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(kaoshiUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getKePu() throws IOException {
		String kepuUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				kepuUrl = "http://news.baidu.com/n?cmd=4&class=discovery&pn=1";
			}if(i==2){
				kepuUrl = "http://news.baidu.com/n?cmd=4&class=discovery&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(kepuUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getKjjd() throws IOException {
		String kjjdUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				kjjdUrl = "http://news.baidu.com/n?cmd=4&class=techfocus&pn=1";
			}if(i==2){
				kjjdUrl = "http://news.baidu.com/n?cmd=4&class=techfocus&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(kjjdUrl).get();
		 getDoc(doc);

		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getKjqt() throws IOException {
		String kjqtUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				kjqtUrl = "http://news.baidu.com/n?cmd=4&class=other_tech&pn=1";
			}if(i==2){
				kjqtUrl = "http://news.baidu.com/n?cmd=4&class=other_tech&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(kjqtUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getKptp() throws IOException {
		String kptpUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				kptpUrl = "http://news.baidu.com/n?cmd=4&class=pdiscovery&pn=1";
			}if(i==2){
				kptpUrl = "http://news.baidu.com/n?cmd=4&class=pdiscovery&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(kptpUrl).get();
		getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getKxsp() throws IOException {
		String kxspUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				kxspUrl = "http://news.baidu.com/n?cmd=4&class=vdiscovery&pn=1";
			}if(i==2){
				kxspUrl = "http://news.baidu.com/n?cmd=4&class=vdiscovery&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(kxspUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getLiCai() throws IOException {
		String licaiUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				licaiUrl = "http://news.baidu.com/n?cmd=4&class=money&pn=1";
			}if(i==2){
				licaiUrl = "http://news.baidu.com/n?cmd=4&class=money&pn=2&sub=0";
			}
		
		 Document doc = Jsoup.connect(licaiUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getLiuXue() throws IOException { 
		String liuxueUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				liuxueUrl = "http://news.baidu.com/n?cmd=4&class=abroad&pn=1";
			}if(i==2){
				liuxueUrl = "http://news.baidu.com/n?cmd=4&class=abroad&pn=2&sub=0";
			}
		
		 Document doc = Jsoup.connect(liuxueUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getMingX() throws IOException {
		String mingxUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				mingxUrl = "http://news.baidu.com/n?cmd=4&class=star&pn=1";
			}if(i==2){
				mingxUrl = "http://news.baidu.com/n?cmd=4&class=star&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(mingxUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getMrhf() throws IOException {
		String mrhfUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				mrhfUrl = "http://news.baidu.com/n?cmd=4&class=meironghf&pn=1";
			}if(i==2){
				mrhfUrl = "http://news.baidu.com/n?cmd=4&class=meironghf&pn=2&sub=0";
			}
					
		 Document doc = Jsoup.connect(mrhfUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getMssj() throws IOException {
		String mssjUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				mssjUrl = "http://news.baidu.com/n?cmd=4&class=WOW&pn=1";
			}if(i==2){
				mssjUrl = "http://news.baidu.com/n?cmd=4&class=WOW&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(mssjUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getMusic() throws IOException {
		String musicUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				musicUrl = "http://news.baidu.com/n?cmd=4&class=music&pn=1";
			}if(i==2){
				musicUrl = "http://news.baidu.com/n?cmd=4&class=music&pn=2&sub=0";
			}
		
		 Document doc = Jsoup.connect(musicUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getNBA() throws IOException {
		String nbaUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				nbaUrl = "http://news.baidu.com/n?cmd=4&class=nba&pn=1";
			}if(i==2){
				nbaUrl = "http://news.baidu.com/n?cmd=4&class=nba&pn=2&sub=0";
			}
		
		 Document doc = Jsoup.connect(nbaUrl).get();
		getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getQglx() throws IOException {
		String qglxUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				qglxUrl = "http://news.baidu.com/n?cmd=4&class=qinggan&pn=1";
			}if(i==2){
				qglxUrl = "http://news.baidu.com/n?cmd=4&class=qinggan&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(qglxUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getQwys() throws IOException {
		String qwysUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				qwysUrl = "http://news.baidu.com/n?cmd=4&class=qwys&pn=1";
			}if(i==2){
				qwysUrl = "http://news.baidu.com/n?cmd=4&class=qwys&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(qwysUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getRwdt() throws IOException { 
		String rwdtUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				rwdtUrl = "http://news.baidu.com/n?cmd=4&class=rwdt&pn=1";
			}if(i==2){
				rwdtUrl = "http://news.baidu.com/n?cmd=4&class=rwdt&pn=2&sub=0";
			}		
		 Document doc = Jsoup.connect(rwdtUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getSczs() throws IOException {
		String sczsUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				sczsUrl = "http://news.baidu.com/n?cmd=4&class=shichangzoushi&pn=1";
			}if(i==2){
				sczsUrl = "http://news.baidu.com/n?cmd=4&class=shichangzoushi&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(sczsUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getShouJi() throws IOException {
		String shoujiUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				shoujiUrl = "http://news.baidu.com/n?cmd=4&class=cell&pn=1";
			}if(i==2){
				shoujiUrl = "http://news.baidu.com/n?cmd=4&class=cell&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(shoujiUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getShuMa() throws IOException { 
		String shumaUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				shumaUrl = "http://news.baidu.com/n?cmd=4&class=daogou&pn=1";
			}if(i==2){
				shumaUrl = "http://news.baidu.com/n?cmd=4&class=daogou&pn=2&sub=0";
			}
		
		 Document doc = Jsoup.connect(shumaUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getShwx() throws IOException {
		String shwxUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				shwxUrl = "http://news.baidu.com/n?cmd=4&class=shwx&pn=1";
			}if(i==2){
				shwxUrl = "http://news.baidu.com/n?cmd=4&class=shwx&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(shwxUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getShyf() throws IOException {
		String shyfUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				shyfUrl = "http://news.baidu.com/n?cmd=4&class=shyf&pn=1";
			}if(i==2){
				shyfUrl = "http://news.baidu.com/n?cmd=4&class=shyf&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(shyfUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getSsyq() throws IOException {
		String ssyqUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				ssyqUrl = "http://news.baidu.com/n?cmd=4&class=search_engine&pn=1";
			}if(i==2){
				ssyqUrl = "http://news.baidu.com/n?cmd=4&class=search_engine&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(ssyqUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getTaiwNews() throws IOException {
		String szywUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				szywUrl = "http://news.baidu.com/n?cmd=4&class=taiwan&pn=1";
			}if(i==2){
				szywUrl = "http://news.baidu.com/n?cmd=4&class=taiwan&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(szywUrl).get();
	     getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getThjj() throws IOException { 
		String thjjUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				thjjUrl = "http://news.baidu.com/n?cmd=4&class=taihaijj&pn=1";
			}if(i==2){
				thjjUrl = "http://news.baidu.com/n?cmd=4&class=taihaijj&pn=2&sub=0";
			}
		
		 Document doc = Jsoup.connect(thjjUrl).get();
	     getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getTvGames() throws IOException { 
		String tvgamesUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				tvgamesUrl = "http://news.baidu.com/n?cmd=4&class=tvgames&pn=1";
			}if(i==2){
				tvgamesUrl = "http://news.baidu.com/n?cmd=4&class=tvgames&pn=2&sub=0";
			}
		
		 Document doc = Jsoup.connect(tvgamesUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getWangY() throws IOException {
		String wangyUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				wangyUrl = "http://news.baidu.com/n?cmd=4&class=netgames&pn=1";
			}if(i==2){
				wangyUrl = "http://news.baidu.com/n?cmd=4&class=netgames&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(wangyUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getWlyx() throws IOException {
		String wlyxUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				wlyxUrl = "http://news.baidu.com/n?cmd=4&class=online_game&pn=1";
			}if(i==2){
				wlyxUrl = "http://news.baidu.com/n?cmd=4&class=online_game&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(wlyxUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getWxyh() throws IOException {
		String wxyhUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				wxyhUrl = "http://news.baidu.com/n?cmd=4&class=weixiu&pn=1";
			}if(i==2){
				wxyhUrl = "http://news.baidu.com/n?cmd=4&class=weixiu&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(wxyhUrl).get();
		 getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getXinChe() throws IOException { 
		String xincheUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				xincheUrl = "http://news.baidu.com/n?cmd=4&class=autobuy&pn=1";
			}if(i==2){
				xincheUrl = "http://news.baidu.com/n?cmd=4&class=autobuy&pn=2&sub=0";
			}		
		 Document doc = Jsoup.connect(xincheUrl).get();
		getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getYanChu() throws IOException {
		String yanchuUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				yanchuUrl = "http://news.baidu.com/n?cmd=4&class=yanchu&pn=1";
			}if(i==2){
				yanchuUrl = "http://news.baidu.com/n?cmd=4&class=yanchu&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(yanchuUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getYeJie() throws IOException {
		String yejieUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				yejieUrl = "http://news.baidu.com/n?cmd=4&class=yejie&pn=1";
			}if(i==2){
				yejieUrl = "http://news.baidu.com/n?cmd=4&class=yejie&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(yejieUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getZcfx() throws IOException {
		String zcfxUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				zcfxUrl = "http://news.baidu.com/n?cmd=4&class=zcfx&pn=1";
			}if(i==2){
				zcfxUrl = "http://news.baidu.com/n?cmd=4&class=zcfx&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(zcfxUrl).get();
			getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getZgjq() throws IOException {
		String zgjqUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				zgjqUrl = "http://news.baidu.com/n?cmd=4&class=zhongguojq&pn=1";
			}if(i==2){
				zgjqUrl = "http://news.baidu.com/n?cmd=4&class=zhongguojq&pn=2&sub=0";
			}		
		 Document doc = Jsoup.connect(zgjqUrl).get();
	     getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getZhty() throws IOException {
		String zhtyUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				zhtyUrl = "http://news.baidu.com/n?cmd=4&class=othersports&pn=1";
			}if(i==2){
				zhtyUrl = "http://news.baidu.com/n?cmd=4&class=othersports&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(zhtyUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getZongYi() throws IOException {
		String zongyiUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				zongyiUrl = "http://news.baidu.com/n?cmd=4&class=zongyi&pn=1";
			}if(i==2){
				zongyiUrl = "http://news.baidu.com/n?cmd=4&class=zongyi&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(zongyiUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
	public String getZqsk() throws IOException {
		String zqskUrl = null;
		for(int i=1;i<=2;i++){
			if(i==1){
				zqskUrl = "http://news.baidu.com/n?cmd=4&class=zqsk&pn=1";
			}if(i==2){
				zqskUrl = "http://news.baidu.com/n?cmd=4&class=zqsk&pn=2&sub=0";
			}
		 Document doc = Jsoup.connect(zqskUrl).get();
         getDoc(doc);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		return null;
	}
}
