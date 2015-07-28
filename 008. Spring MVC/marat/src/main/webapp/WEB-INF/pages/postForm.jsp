<%--
  Created by IntelliJ IDEA.
  User: Marat_Chardymau
  Date: 7/24/2015
  Time: 12:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<form:form method="POST" action="/postWithForm" modelAttribute="studentForm">
  <table>
    <tr>
      <td><form:label path="id">Id</form:label></td>
      <td><form:input path="id"/></td>
    </tr>
    <tr>
      <td><form:label path="name">Name</form:label></td>
      <td><form:input path="name"/></td>
    </tr>
    <tr>
      <td><form:label path="age">Age</form:label></td>
      <td><form:input path="age"/></td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="submit" value="Submit"/>
      </td>
    </tr>
    <tr>${inputErrors}</tr>
  </table>
</form:form>
</body>
</html>
