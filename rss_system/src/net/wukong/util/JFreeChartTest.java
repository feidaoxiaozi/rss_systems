package net.wukong.util;

import java.awt.Font;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class JFreeChartTest extends ApplicationFrame{
	public JFreeChartTest(String title){
		super(title);
		this.setContentPane(createPanel());
	}
	 public static CategoryDataset createDataset(){
		 DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		 dataset.setValue(6, "", "00:00");
		 dataset.setValue(3, "", "02:00");
		 dataset.setValue(5, "", "04:00");
		 dataset.setValue(3, "", "06:00");
		 dataset.setValue(9, "", "08:00");
		 dataset.setValue(11, "", "10:00");
		 dataset.setValue(3, "", "12:00");
		 dataset.setValue(15, "", "14:00");
		 dataset.setValue(34, "", "16:00");
		 dataset.setValue(21, "", "18:00");
		 
		
		  return dataset;
	  } 
	 public static JFreeChart createChart(CategoryDataset dataset){
		 JFreeChart chart = ChartFactory.createBarChart("hello", "时间", "相关度", dataset, PlotOrientation.VERTICAL, true, false, false);
		 
		 chart.setTitle(new TextTitle("资讯<<谷歌街景将登陆日本WiiU设备>>当日不同时间段的关注度",new Font("宋体",Font.BOLD+Font.ITALIC,20)));
		 CategoryPlot plot = (CategoryPlot)chart.getPlot();
		 NumberAxis numberaxis = (NumberAxis) plot.getRangeAxis();    
		  numberaxis.setAutoTickUnitSelection(false);    
	        numberaxis.setTickUnit(new NumberTickUnit(2));    

		 CategoryAxis axis = plot.getDomainAxis();
		 axis.setLabelFont(new Font("微软雅黑",Font.BOLD,12));
		 return chart;
	 }
	 public static JPanel createPanel(){
		 JFreeChart chart = createChart(createDataset());
		 return new ChartPanel(chart);
	 }
  public static void main(String[] args) {
	  JFreeChartTest jfct = new JFreeChartTest("资讯<<谷歌街景将登陆日本WiiU设备>>当日不同时间段的关注度");
	  jfct.pack();
	  jfct.setVisible(true);
}
}
