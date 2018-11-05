
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body><table border="1" cellspacing="0" cellpadding="0">
    <tr>
        <th>书名</th>
        <th>作者</th>
        <th>价钱</th>
    </tr>
    <c:forEach items="${bookList}" var="book">
        <tr>
            <th>${book.bookName}</th>
            <th>${book.author}</th>
            <th>${book.price}</th>
        </tr>
    </c:forEach>
</table>
</body>
</html>
