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
<f:view beforePhase="#{showPostController.beforePhase}">
	<f:loadBundle basename="app.bundle.messages" var="msg"/>
	<h:form binding="#{showPostController.showArticleForm}">
		<p>Article Post</p>
		<h:outputText value="#{showPostController.articlePost.title}" />
		<h:panelGrid columns="2">
			<h:outputText value="Author name:" />
			<h:outputText value="#{showPostController.articlePost.author}" />
			<h:outputText value="Post date:" />
			<h:outputText value="#{showPostController.articlePost.postDate}" />
			<h:outputText value="Last update:" />
			<h:outputText value="#{showPostController.articlePost.lastUpdate}" />
			<h:outputText value="Summary:" />
			<h:outputText value="#{showPostController.articlePost.summary}" />
		</h:panelGrid>
		<h:outputText value="#{showPostController.articlePost.content}" />
	</h:form>
	
	<h:form binding="#{showPostController.showQuestionForm}">
		<p>Question Post</p>
		<h:outputText value="#{showPostController.questionPost.title}" />
		<h:panelGrid columns="2">
			<h:outputText value="Author name:" />
			<h:outputText value="#{showPostController.questionPost.author}" />
			<h:outputText value="Post date:" />
			<h:outputText value="#{showPostController.questionPost.postDate}" />
		</h:panelGrid>
		<h:outputText value="#{showPostController.questionPost.content}" />
	</h:form>
	
	<h:form>
		<p>Article Comments:</p>
		
		<h:dataTable value="#{showPostController.comments}" var="comment">
			<h:column>
				<h:panelGrid columns="2">
					<h:outputText value="Author: " />
					<h:outputText value="#{comment.author}" />
				</h:panelGrid>
				<h:outputText value="#{comment.content}" />
				<h:panelGrid columns="2">
					<h:outputText value="Post Date: " />
					<h:outputText value="#{comment.postDate}" />
				</h:panelGrid>
			</h:column>
		</h:dataTable>
	</h:form>
	
	<h:form binding="#{showPostController.addArticleCommentForm}">
		<p>Add comment:</p>
		<h:panelGrid columns="2">
			<h:outputText value="Author name:" />
			<h:inputText value="#{showPostController.articleComment.author}" />
			<h:outputText value="Comment:" />
			<h:inputTextarea value="#{showPostController.articleComment.content}" />
			<h:outputText value="" />
			<h:commandButton value="Submit" action="#{showPostController.addComment}"/>
		</h:panelGrid>
	</h:form>
	
	<h:form binding="#{showPostController.addQuestionCommentForm}">
		<p>Add comment:</p>
		<h:panelGrid columns="2">
			<h:outputText value="Author name:" />
			<h:inputText value="#{showPostController.questionComment.author}" />
			<h:outputText value="Comment:" />
			<h:inputTextarea value="#{showPostController.questionComment.content}" />
			<h:outputText value="" />
			<h:commandButton value="Submit" action="#{showPostController.addComment}"/>
		</h:panelGrid>
	</h:form>
	
</f:view>
</body>	
</html> 
