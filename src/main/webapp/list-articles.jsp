<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Blog - Articles</title>
</head>
<body>
<h1>Articles</h1>
<ul>
    <c:forEach var="article" items="${articles}">
        <li><a href="view-article?title=${article.title}">${article.title}</a></li>
    </c:forEach>
</ul>
<a href="add-article.jsp">Add New Article</a>
</body>
</html>
