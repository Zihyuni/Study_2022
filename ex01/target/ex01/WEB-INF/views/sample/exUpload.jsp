<%--
  Created by IntelliJ IDEA.
  User: jihyun
  Date: 2022-03-08
  Time: 오후 5:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html> <html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

<form action="/sample/exUploadPost" method="post" enctype="multipart/form-data">

    <div>
        <input type='file' name="files">
    </div>
    <div>
        <input type='file' name="files">
    </div>
    <div>
        <input type='file' name="files">
    </div>
    <div>
        <input type='file' name="files">
    </div>
    <div>
        <input type='file' name="files">
    </div>

    <input type="submit">
</form>
</html>