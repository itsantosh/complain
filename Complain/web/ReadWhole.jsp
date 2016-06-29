<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="shared/header.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="dao" class="com.santosh.complain.daoimpl.ComplainDaoImpl"/>
<jsp:useBean id="clientdao" class="com.santosh.complain.daoimpl.ClientDaoImpl"/>
 
<c:forEach var="client" items="${clientdao.all}">
    <H1>${client.firstName}</H1>
    <Div>
    </DIV>

   <a href="ComplainList.jsp">back</a>
 
    </c:forEach>