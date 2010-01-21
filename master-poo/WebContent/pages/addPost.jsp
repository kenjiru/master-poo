<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>Add a post</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/main.css" />
</head>

<body>
<div id="header">
	<div class="wrapper"><a href="../index.jsp">Forum Application</a></div>
</div>
<div id="headline">
	<div class="wrapper"><h1>Add a post</h1></div>
</div>

<br/>
<div class="wrapper">
<f:view beforePhase="#{addPostController.beforePhase}">
	<f:loadBundle basename="app.bundle.messages" var="msg"/>
	
	<h:form binding="#{addPostController.addArticleForm}" styleClass="addPost">
		<h2>Article</h2>
		<p>Author:</p>
		<h:inputText value="#{addPostController.articlePage.author}" /> <br/>
		<p>Title:</p>
		<h:inputText value="#{addPostController.articlePage.title}" /> <br/>
		<p>Summary:</p>
		<h:inputTextarea styleClass="summary" value="#{addPostController.articlePage.summary}" /> <br/>
		<p>Article content:</p>
		<h:inputTextarea value="#{addPostController.articlePage.content}" /> <br/>
		<h:commandButton styleClass="submit" value="Submit" action="#{addPostController.addArticle}"/>
	</h:form>
	
	<h:form binding="#{addPostController.addQuestionForm}" styleClass="addPost">
		<h2>Question</h2>
		<p>Author:</p>
		<h:inputText value="#{addPostController.questionPage.author}" /> <br/>
		<p>Title:</p>
		<h:inputText value="#{addPostController.questionPage.title}" /> <br/>
		<p>Question content:</p>
		<h:inputTextarea value="#{addPostController.questionPage.content}" /> <br/>
		<h:commandButton styleClass="submit" value="Submit" action="#{addPostController.addQuestion}"/>
	</h:form>
</f:view>
</div>

</body>
</html>
