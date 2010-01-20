<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<html>
<head>
 <title>Greeting page</title>
</head>    
<body>
<f:view>
	<f:loadBundle basename="app.bundle.messages" var="msg"/>
	<h:outputText value="#{msg.hello}" />
</f:view>
</body>	
</html> 
