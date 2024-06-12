<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>${article.title}</title>
</head>
<body>
<h1>${article.title}</h1>
<p>${article.content}</p>
<p>Published on: ${article.publicationDate}</p>
<a href="list-articles">Back to Articles</a>
</body>
</html>
