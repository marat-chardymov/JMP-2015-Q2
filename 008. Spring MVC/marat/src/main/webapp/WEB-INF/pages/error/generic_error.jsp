<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>

<c:if test="${not empty exception.errorCode}">
  <h1>${exception.errorCode}</h1>
</c:if>


<c:if test="${not empty exception.errorMessage}">
  <h2>${exception.errorMessage}</h2>
</c:if>

</body>
</html>