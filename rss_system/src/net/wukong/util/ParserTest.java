package net.wukong.util;

import java.util.HashMap;

import net.wukong.dao.DataTransfer;
import net.wukong.dao.impl.RssNewsDaoImpl;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ParserTest implements DataTransfer {
	
	public Document getDoc(Document doc) {
		Elements content = doc.select("div.p2 div");
		String url = null;
		String title = null;
		String resourceAndTime = null;
		String from = null;
		String time = null;
		String attention = null;
		for (Element item : content) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			Elements a = item.getElementsByTag("a").not(".rnews");
			Elements spanRes = item.select(".c");
			Elements spanAttr = item.getElementsByTag("span").not(".c");						
			for (Element item_a : a) {
				url = item_a.attr("href");
				title = item_a.text();
				System.out.println(title);
				System.out.println(url);
				map.put(TITLE, title);
				map.put(URL, url);
			}
			for (Element resSpan : spanRes) {
				resourceAndTime = resSpan.text();
				String[] ss = resourceAndTime.split("\u00a0");
				from = ss[0];
				time = ss[1];
				map.put(FROM, from);
				map.put(TIME, time);
				System.out.println(from);
				System.out.println(time);
			}
			for (Element item_span : spanAttr) {
				if (null != attention && " " != attention) {

					attention = item_span.text().replace(">>", "").replace(
							"Ãıœ‡πÿ", "");
					map.put(ATTENTION, attention);

				} else {
					attention = "0";
					map.put(ATTENTION, "0");
				}
				System.out.println(attention);
			}
			RssNewsDaoImpl.data.add(map);
		}
		return doc;
	}

}
