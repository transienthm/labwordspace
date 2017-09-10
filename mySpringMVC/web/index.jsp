<%--
  Created by IntelliJ IDEA.
  User: wangbin
  Date: 2017/2/1
  Time: 上午9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello mySpringMVC</title>
</head>
<body>
    <a href="hellotest">test</a>
    <a href="hello">springmvc</a>
    <form action="/data" method="post">
        name:<input type="text" name="name" />
        <input type="submit" value="submit" />
    </form>
</body>
</html>
