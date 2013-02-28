<%@ page language="java" contentType="text/html; charset=utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>      
    <title>用户登录</title>   
   
   <link href="bootstrap/css/bootstrap.css" rel="stylesheet">
    <style type="text/css">
      body {
        padding-top: 40px;
        padding-bottom: 40px;
        background-color: #f5f5f5;
      }

      .form-signin {
        max-width: 300px;
        padding: 19px 29px 29px;
        margin: 0 auto 20px;
        background-color: #fff;
        border: 1px solid #e5e5e5;
        -webkit-border-radius: 5px;
           -moz-border-radius: 5px;
                border-radius: 5px;
        -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
           -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
                box-shadow: 0 1px 2px rgba(0,0,0,.05);
      }
      .form-signin .form-signin-heading,
      .form-signin .checkbox {
        margin-bottom: 10px;
      }
      .form-signin input[type="text"],
      .form-signin input[type="password"] {
        font-size: 16px;
        height: auto;
        margin-bottom: 15px;
        padding: 7px 9px;
      }

    </style>
    <link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="../assets/js/html5shiv.js"></script>
    <![endif]-->

    <!-- Fav and touch icons -->
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="bootstrap/img/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="bootstrap/img/apple-touch-icon-114-precomposed.png">
      <link rel="apple-touch-icon-precomposed" sizes="72x72" href="bootstrap/img/apple-touch-icon-72-precomposed.png">
                    <link rel="apple-touch-icon-precomposed" href="bootstrap/img/apple-touch-icon-57-precomposed.png">
                                   <link rel="shortcut icon" href="bootstrap/img/favicon.png">
  </head>

  <body>
  
   <form action="verifyUser.action" method="post" class="form-horizontal">
    <h2 class="form-signin-heading">请进行登录</h2>
  <div class="control-group">
    <label class="control-label">用户名</label>
    <div class="controls">
      <input type="text" name="user.username" >
    </div>
  </div>
  <div class="control-group">
    <label class="control-label">密码</label>
    <div class="controls">
      <input type="password" name="user.password">
    </div>
  </div>
  <div class="control-group">
    <div class="controls">
      <label class="checkbox">
       <input type="checkbox" value="remember-me"> 记住密码
      </label>
      <button class="btn" value="submit" type="submit">登录</button>
    </div>
  </div>
</form>
  </body>
</html>
