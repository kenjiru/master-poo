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
<f:view>
	<f:loadBundle basename="app.bundle.messages" var="msg"/>
	<h:form binding="#{postController.listPostsForm}">
		<p>Posts</p>
		<h:dataTable value="#{postController.posts}" var="post"
			rowClasses="oddRow, evenRow"
			rendered="#{not empty postController.posts}"
			styleClass="contactTable" headerClass="headerTable"
			columnClasses="normal,centered">
			<h:column>
				<f:facet name="header">
					<h:column>
						<h:outputText value="Title" />
					</h:column>
				</f:facet>
				<h:commandLink value="#{post.title}" action="#{postController.view}">
					<f:setPropertyActionListener target="#{postController.selectedPost}" value="#{post}" />
				</h:commandLink>
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:column>
						<h:outputText value="Date" />
					</h:column>
				</f:facet>
				<h:outputText value="#{post.postDate}" />
			</h:column>
		</h:dataTable>
	</h:form>
</f:view>
</body>
</html>
