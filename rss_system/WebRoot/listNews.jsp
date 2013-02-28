<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
  <head>    
  <title>悟空媒体化资讯平台</title>
  <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
  <script src="http://code.jquery.com/jquery.js"></script>
  <script src="bootstrap/js/bootstrap.min.js"></script>
  <link href="bootstrap/css/bootstrap.css" rel="stylesheet">
  <link rel="stylesheet" href="tutorial.css"/>
  <script src="datetimepicker_css.js"></script>
<style type="text/css">

body {
  padding-top: 60px;
  padding-bottom: 40px;
}
.sidebar-nav {
  padding: 9px 0;
}

@media (max-width: 980px) {
  /* Enable use of floated navbar text */
  .navbar-text.pull-right {
    float: none;
    padding-left: 5px;
    padding-right: 5px;
  }
}
</style>
  
<script type="text/javascript">
    
    function check(){

    if(document.getElementById("keyWords").value==""){
      alert("请输入关键字"); 
      return false; 
    }if(document.getElementById("bigAttention").value ==""){
       alert("请填写最小关注度"); 
       return false; 
    }
    if(document.getElementById("smallTime").value ==""){
        alert("请选择起始时间");
        return false; 
    }
     if(document.getElementById("bigTime").value ==""){
        alert("请选择终止时间");
        return false;  
    }
        return true;  
    }
</script>

</head>
<body>
   
   
  <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container-fluid">
          <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="brand" href="#">媒体化资讯平台</a>
          <div class="nav-collapse collapse">
            <p class="navbar-text pull-right">
              欢迎 <s:property value="user.username"/> 的光临
            </p>
            
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

   <div class="container-fluid">
      <div class="row-fluid">
        <div class="span1">
          <div class="well sidebar-nav">
            <ul class="nav nav-list">
            
              <li class="nav-header">国内</li>
              <li class="active"><a href="loadSzywNews.action">时政要闻</a></li>
              <li><a href="loadTwNews.action">台湾</a></li>
              <li><a href="loadGangAoNews.action">港澳</a></li>
              
              <li class="nav-header">国际</li>
              <li><a href="loadhqsyNews.action">环球视野</a></li>
              <li><a href="loadGjrwNews.action">国际人物</a></li>             
              <li class="nav-header">军事</li>
              <li><a href="loadZgjqNews.action">中国军情</a></li>
              <li><a href="loadThjjNews.action">台海聚焦</a></li>
              <li><a href="loadGjjqNews.action">国际军情</a></li>
               <li class="nav-header">财经</li>
              <li><a href="loadGuPiaoNews.action">股票</a></li>
              <li><a href="loadLiCaiNews.action">理财</a></li>
              <li><a href="loadJjmsNews.action">经济民生</a></li>
               <li class="nav-header">互联网</li>
              <li><a href="loadRwdtNews.action">人物动态</a></li>
              <li><a href="loadGsdtNews.action" >公司动态</a></li>
              <li><a href="loadSsyqNews.action" >搜索引情</a></li>
              <li><a href="loadDzswNews.action" >电子商务</a></li>
              <li><a href="loadWlyxNews.action" >网络游戏</a></li>
              <li><a href="loadHlwplNews.action" >互联网评论</a></li>
              <li class="nav-header">房产</li>
              <li><a href="loadGddtNews.action">各地动态</a></li>
              <li><a href="loadZcfxNews.action" >政策风向</a></li>
              <li><a href="loadSczsNews.action" >市场走势</a></li>
              <li><a href="loadJiaJuNews.action">家居</a></li>
              <li><a href="loadFcplNews.action">房产评论</a></li>
              <li><a href="loadFczxNews.action" >房产资讯</a></li>
              <li><a href="loadFcjdNews.action" >房产焦点</a></li>
               <li class="nav-header">汽车</li>
              <li><a href="loadXinCheNews.action">新车</a></li>
              <li><a href="loadDaoGouNews.action">导购</a></li>
              <li><a href="loadGdhqNews.action">各地行情</a></li>
              <li><a href="loadWxyhNews.action">维修养护</a></li>
              <li class="nav-header">体育</li>
              <li><a href="loadNBANews.action">NBA</a></li>
              <li><a href="loadGjzqNews.action">国际足球</a></li>
              <li><a href="loadGnzqNews.action">国内足球</a></li>
              <li><a href="loadCBANews.action" >CBA</a></li>
              <li><a href="loadZhtyNews.action" >综合体育</a></li>
              <li><a href="loadAoYunNews.action" >奥运</a></li>
              <li class="nav-header">娱乐</li>
              <li><a href="loadMingXNews.action">明星</a></li>
              <li><a href="loadDianYNews.action">电影</a></li>
              <li><a href="loadDianshNews.action">电视</a></li>
              <li><a href="loadMusicNews.action" >音乐</a></li>
              <li><a href="loadZongYiNews.action" >综艺</a></li>
              <li><a href="loadYanChuNews.action">演出</a></li>
              <li><a href="loadJiangXNews.action">奖项</a></li>
              <li class="nav-header">游戏</li>
              <li><a href="loadWangYNews.action" >网络游戏</a></li>
              <li><a href="loadTvGamesNews.action" >电视游戏</a></li>
              <li><a href="loadDzjjNews.action">电子竞技</a></li>
              <li><a href="loadHotYxNews.action">热门游戏</a></li>
              <li><a href="loadMssjNews.action">魔兽世界</a></li>
              <li class="nav-header">教育</li>
              <li><a href="loadKaoShiNews.action">考试</a></li>
              <li><a href="loadLiuXueNews.action">留学</a></li>
              <li><a href="loadJiuYeNews.action" >就业</a></li>
              <li class="nav-header">女人</li>
              <li><a href="loadClfsNews.action">潮流服饰</a></li>
              <li><a href="loadMrhfNews.action">美容护肤</a></li>
              <li><a href="loadJfjsNews.action">减肥健身</a></li>
              <li><a href="loadQglxNews.action">情感两性</a></li>
              <li><a href="loadJkysNews.action" >健康养生</a></li>
               <li class="nav-header">科技</li>
              <li><a href="loadShouJiNews.action">手机</a></li>
              <li><a href="loadShuMaNews.action">数码</a></li>
              <li><a href="loadDianNaoNews.action">电脑</a></li>
              <li><a href="loadKePuNews.action">科普</a></li>
              <li><a href="loadKjqtNews.action">科及其他</a></li>
              <li><a href="loadYeJieNews.action">业界</a></li>
              <li><a href="loadJiaDianNews.action">家电</a></li>
              <li><a href="loadKptpNews.action">科普图片</a></li>
              <li><a href="loadKxspNews.action">科学视频</a></li>
              <li><a href="loadKjjdNews.action" >科技焦点</a></li>
               <li class="nav-header">社会</li>
              <li><a href="loadShyfNews.action">社会与法</a></li>
              <li><a href="loadShwxNews.action">社会万象</a></li>
              <li><a href="loadZqskNews.action">真情时刻</a></li>
              <li><a href="loadQwysNews.action">奇闻异事</a></li>            
            </ul>
        </div><!--/.well -->
        </div><!--/span-->
        
         

       <div class="span10">
          <div class="well sidebar-nav">
          
          <form action="findNewsByTitle" method="post"  class="form-search">
          <fieldset>
          
          <label><font size="5" color="red">查询条件</font></label><br>
             输入关键字：<input type="text" name="keyWords" id="keyWords" class="input-medium search-query"/> 
          输入关注度期望值： <s:textfield name="bigAttention" id="bigAttention" cssClass="input-medium search-query"/> * 只能输入数字 <br>
                 <label for="demo3">请输入起始时间:</label>
                 <input type="text" name="smallTime" id="smallTime" maxlength="25" size="25"/>
                 <img src="image/cal.gif" alt="" onclick="javascript:NewCssCal('smallTime','yyyyMMdd','arrow',true,'24',true)" style="cursor:pointer"/>           
                 <label for="demo3">请输入结束时间:</label>
                 <input type="text" name="bigTime" id="bigTime" maxlength="25" size="25"/>
                 <img src="image/cal.gif" alt="" onclick="javascript:NewCssCal('bigTime','yyyyMMdd','arrow',true,'24',true)" style="cursor:pointer"/>
                  <br>      
                           <input type="submit" name="submit" onclick="return check();" value="查询">
                          
                           <!-- 
                          <button class="btn btn-inverse" value="查询" type="submit" onclick="return check()">查询</button>
                            -->     
        <fieldset>
        </form>
          </div>
          </div>
        <div class="span11">
          <div class="hero-unit">
        
  <s:form action="" method="post" theme="simple">
<table class="table table-striped" onmouseover="changeto()"  onmouseout="changeback()">
      <tr>       
        <td><div align="center"><span class="STYLE10">序号</span></div></td>
        <td><div align="center"><span class="STYLE10">新闻标题</span></div></td>
        <td><div align="center"><span class="STYLE10">URL</span></div></td>
        <td><div align="center"><span class="STYLE10">来源</span></div></td>
        <td><div align="center"><span class="STYLE10">时间</span></div></td>
        <td><div align="center"><span class="STYLE10">关注度</span></div></td>
         <td><div align="center"><span class="STYLE10">下发</span></div></td>      
      </tr> 
      <s:iterator value="rssNews.list" >       
			 <tr>              
                   <td><div align="center"><s:property value="newsId"/></div></td>
                   <td><div align="left"><s:property value="title"/></div></td>                  
                   <td><div align="left"><a href="<s:property value="url"/>"><s:property value="url"/></a></div></td>
                   <td><div align="center"><s:property value="resource"/></div></td> 
                   <td><div align="center"><s:property value="time"/></div></td>                  
                   <td><div align="center"><s:property value="attention"/></div></td>
                    <!--  
                   <div><button id="#myModal" class="btn btn-inverse" value="下发" type="button">下发</button></div></td>
                   -->
                   <td><a href="#myModal" role="button" class="btn" data-toggle="modal">下发</a></td>
                    <!--
                   <td><s:a href="sms.jsp" >下发</s:a></td>
                   -->
                   <s:hidden value="#rssNews.classes"/>                      
              </tr>
              </s:iterator> 
      
    </table>
  共<s:property value="rssNews.allRow"/> 条记录
　　　　共<s:property value="rssNews.totalPage"/> 页
　　　　当前第<s:property value="rssNews.currentPage"/>页<br/>
　　　　<s:if test="%{rssNews.currentPage == 1}">
　　　　　　第一页 上一页       
　　　　</s:if>
　　　　<s:else>
　　　　　　  <a href="listRssNews.action?page=1">第一页</a>
　　　　　　<a href="listRssNews.action?page=<s:property value="%{rssNews.currentPage-1}"/>">上一页</a>
　　　　</s:else>
　　　　<s:if test="%{rssNews.currentPage != rssNews.totalPage}">
　　　　　　<a href="listRssNews.action?page=<s:property value="%{rssNews.currentPage+1}"/>">下一页</a>
　　　　　　<a href="listRssNews.action?page=<s:property value="rssNews.totalPage"/>">最后一页</a>
　　　　</s:if>
     <s:else>
　　　　　　下一页 最后一页
　　　　</s:else>
     </s:form>
		 </div><!--/row-->
        </div><!--/span-->
      </div><!--/row-->
       
	<!-- Button to trigger modal -->

 
<!-- Modal -->
<div id="myModal" class="modal hide fade">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h3 id="myModalLabel">短信下发</h3>
  </div>
  <div class="modal-body">
    <iframe width="500" height="600" src="sms.jsp"/>
  </div>
  <div class="modal-footer">
    <button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
    <button class="btn btn-primary">Save changes</button>
  </div>
    </div>
      <hr>

      <footer>
        <p>&copy; Company 2013</p>
      </footer>
 </div>              
</body>
</html>
