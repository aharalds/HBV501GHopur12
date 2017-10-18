<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Food! </title>  
</head>
<body>
    <c:choose>
        <c:when test="${not empty allFood}">
            <table class="allFood">
                <thead>
                    <tr>
                        <th>Nafn</th>
                        <th>Protein</th>
                        <th>Kolvetni</th>
                        <th>Fita</th>
                    </tr>
                </thead>
                <c:forEach var ="fooditem" items="${allFood}">
                    <tr>
                        <td>${fooditem.name} </td>
                        <td>${fooditem.protein}</td>
                        <td>${fooditem.carb}</td>
                        <td>${fooditem.fat}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <h3>NOFOOD!</h3>
        </c:otherwise>
    </c:choose>
</body>
</html>