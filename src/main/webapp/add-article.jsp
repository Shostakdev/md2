<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add New Article</title>
</head>
<body>
<h1>Add New Article</h1>
<form action="add-article" method="post">
    <label for="title">Title:</label>
    <input type="text" id="title" name="title" required><br>
    <label for="content">Content:</label>
    <textarea id="content" name="content" required></textarea><br>
    <button type="submit">Add Article</button>
</form>
<a href="list-articles">Back to Articles</a>
</body>
</html>
