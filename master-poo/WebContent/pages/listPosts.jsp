<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>Recent Posts</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/main.css" />
</head>

<body>
<div id="header">
	<div class="wrapper"><a href="index.jsp">Forum Application</a></div>
</div>
<div id="headline">
	<div class="wrapper"><h1>Recent Posts</h1></div>
</div>

<br/>
<div class="wrapper">
<f:view>
	<f:loadBundle basename="app.bundle.messages" var="msg"/>
	<h:form binding="#{listPostsController.listPostsForm}">
		<h:dataTable value="#{listPostsController.posts}" var="post"
			rowClasses="oddRow, evenRow" styleClass="postsTable" headerClass="header">
			<h:column>
				<h3>
					<h:commandLink value="#{post.title}" action="#{listPostsController.showPost}">
						<f:setPropertyActionListener target="#{listPostsController.selectedPost}" value="#{post}" />
					</h:commandLink>
				</h3>
				<div class="content">
					<h:outputText value="#{post.content}" />
				</div>
			</h:column>
		</h:dataTable>
		
		<br/>
		<div class="nav">
			<h:commandLink value="Add Article" action="add" actionListener="#{addPostController.add}">
				<f:attribute name="postType" value="Article"/>
			</h:commandLink>
			<h:commandLink value="Add Question" action="add" actionListener="#{addPostController.add}">
				<f:attribute name="postType" value="Question"/>
			</h:commandLink>
		</div>
	</h:form>
</f:view>
</div>

</body>
</html>
