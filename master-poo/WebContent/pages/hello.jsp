<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<f:loadBundle basename="app.bundle.messages" var="msg"/>

<html>
  <head>
   <title>greeting page</title>
  </head>    
  <body>
     <f:view>
	 	 <h:outputText value="#{msg.hello}" />
     </f:view>
 </body>	
</html> 
