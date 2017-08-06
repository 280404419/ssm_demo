<%@ page  language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<!doctype html >
<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=UTF-8">
    <title>insert title here</title>
</head>
<body>
    <form action="${pageContext.request.contextPath }/adduser" METHOD="post">
        用户名：<input type="text" name="userName" id="userNameQ">
        密码：<input type="text" name="password" id="passwordQ">
        年龄：<input type="text" name="age" id="age">
        <input type="submit" value="提交">
    </form>
</body>
</html>
