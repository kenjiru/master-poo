<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>List articles</title>
</head>
<body>
<f:view beforePhase="#{addPostController.beforePhase}">
	<f:loadBundle basename="app.bundle.messages" var="msg"/>
	<h:form binding="#{addPostController.addArticleForm}">
		<p>Add Article</p>
	</h:form>
	
	<h:form binding="#{addPostController.addQuestionForm}">
		<p>Add Question</p>
	</h:form>
</f:view>
</body>
</html>
