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
		<h:panelGrid columns="2">
			<h:outputText value="Author name:" />
			<h:inputText value="#{addPostController.articlePage.author}" />
			<h:outputText value="Title:" />
			<h:inputTextarea value="#{addPostController.articlePage.title}" />
			<h:outputText value="Summary:" />
			<h:inputTextarea value="#{addPostController.articlePage.summary}" />
			<h:outputText value="Content:" />
			<h:inputTextarea value="#{addPostController.articlePage.content}" />
			<h:outputText value="" />
			<h:commandButton value="Submit" action="#{addPostController.addArticle}"/>
		</h:panelGrid>
	</h:form>
	
	<h:form binding="#{addPostController.addQuestionForm}">
		<p>Add Question</p>
		<h:panelGrid columns="2">
			<h:outputText value="Author name:" />
			<h:inputText value="#{addPostController.questionPage.author}" />
			<h:outputText value="Title:" />
			<h:inputTextarea value="#{addPostController.questionPage.title}" />
			<h:outputText value="Content:" />
			<h:inputTextarea value="#{addPostController.questionPage.content}" />
			<h:outputText value="" />
			<h:commandButton value="Submit" action="#{addPostController.addQuestion}"/>
		</h:panelGrid>
	</h:form>
</f:view>
</body>
</html>
