<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>Post Details</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/main.css" />
</head>

<body>
<div id="header">
	<div class="wrapper"><a href="../index.jsp">Forum Application</a></div>
</div>
<div id="headline">
	<div class="wrapper"><h1>Post Details</h1></div>
</div>

<br/>
<div class="wrapper">
<f:view beforePhase="#{showPostController.beforePhase}">
	<f:loadBundle basename="app.bundle.messages" var="msg"/>
	
	<h:form binding="#{showPostController.showArticleForm}" styleClass="post">
		<p><h:outputText styleClass="title" value="#{showPostController.articlePost.title}" /></p>
		<p><h:outputText styleClass="summary" value="#{showPostController.articlePost.summary}" /></p>
		<p><h:outputText styleClass="content" value="#{showPostController.articlePost.content}" /></p>
		<div class="footer">
			Posted by: <h:outputText styleClass="author" value="#{showPostController.articlePost.author}" />
			Date: <h:outputText styleClass="date" value="#{showPostController.articlePost.postDate}" />
		</div>
	</h:form>
	
	<h:form binding="#{showPostController.showQuestionForm}" styleClass="post">
		<p><h:outputText styleClass="title" value="#{showPostController.questionPost.title}" /></p>
		<p><h:outputText styleClass="content" value="#{showPostController.questionPost.content}" /></p>
		<div class="footer">
			Posted by: <h:outputText styleClass="author" value="#{showPostController.questionPost.author}" />
			Date: <h:outputText styleClass="date" value="#{showPostController.questionPost.postDate}" />
		</div>
	</h:form>
	<br/>
	
	<h:form>
		<p>Article Comments:</p>
		
		<h:dataTable value="#{showPostController.comments}" var="comment">
			<h:column>
				<div class="comment">
					<p><h:outputText value="#{comment.author}" styleClass="author" /> says: </p>
					<h:outputText value="#{comment.content}" />
					<div class="footer">Date: <h:outputText styleClass="date" value="#{comment.postDate}" /></div>
				</div>
			</h:column>
		</h:dataTable>
	</h:form>
	<br/>
	
	<h:form binding="#{showPostController.addArticleCommentForm}" styleClass="addComment">
		<p>Leave a comment:</p>
		<h:inputText value="#{showPostController.articleComment.author}" />
		<h:outputText value="Author" /> <br/>
		<h:inputTextarea value="#{showPostController.articleComment.content}" /> <br/>
		<h:commandButton styleClass="submit" value="Submit" action="#{showPostController.addComment}"/>
	</h:form>
	
	<h:form binding="#{showPostController.addQuestionCommentForm}" styleClass="addComment">
		<p>Leave a comment:</p>
		<h:inputText value="#{showPostController.questionComment.author}" />
		<h:outputText value="Author" /> <br/>
		<h:inputTextarea value="#{showPostController.questionComment.content}" /> <br/>
		<h:commandButton styleClass="submit" value="Submit" action="#{showPostController.addComment}"/>
	</h:form>
</f:view>
</div>

</body>	
</html> 
