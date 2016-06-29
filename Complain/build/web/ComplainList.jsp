<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="shared/header.jsp"%>
<jsp:useBean id="complain" class="com.santosh.complain.entity.Complain"/>
<jsp:useBean id="dao" class="com.santosh.complain.daoimpl.ComplainDaoImpl"/>
 
<c:forEach var="complain" items="${dao.all}">
    <H1>${complain.title}</H1>
    <Div>
    ${complain.description}
    </DIV>


   
    <div class="form-group">
        <a href="ReadWhole.jsp?id=${complain.clientId}">Read More</a>
    </div>
      

    </c:forEach>
   

