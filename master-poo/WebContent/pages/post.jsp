<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<html>
<head>
	<title>List articles</title>
</head>
<body>
<f:view>
	<f:loadBundle basename="app.bundle.messages" var="msg"/>
	<h:form>
		<p>Posts</p>
		<h:dataTable value="#{postController.posts}" var="post"
			rowClasses="oddRow, evenRow"
			rendered="#{not empty postController.posts}"
			styleClass="contactTable" headerClass="headerTable"
			columnClasses="normal,centered">
			<h:column>
				<f:facet name="header">
					<h:column>
						<h:outputText value="Id" />
					</h:column>
				</f:facet>
				<h:outputText value="#{post.id}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:column>
						<h:outputText value="Title" />
					</h:column>
				</f:facet>
				<h:outputText value="#{post.title}" />
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
