<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2>用户登录</h2>
<p>${error}</p>
<form action="/LNzzjM/login" method="post">
  <p> 用户名： </p> <input type="text" name="username" />
  <p> 密   码：  </p> <input type="password" name="password" />
  <p><input type="submit" value="登录"/> </p>
 
</form>
</body>
</html>
