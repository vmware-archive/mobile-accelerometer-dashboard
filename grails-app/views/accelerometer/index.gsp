
<%@ page import="com.pivotal.fe.mobile.Accelerometer" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'accelerometer.label', default: 'Accelerometer')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-accelerometer" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-accelerometer" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="activity" title="${message(code: 'accelerometer.activity.label', default: 'Activity')}" />
					
						<g:sortableColumn property="alt" title="${message(code: 'accelerometer.alt.label', default: 'Alt')}" />
					
						<g:sortableColumn property="device" title="${message(code: 'accelerometer.device.label', default: 'Device')}" />
					
						<g:sortableColumn property="diffX" title="${message(code: 'accelerometer.diffX.label', default: 'Diff X')}" />
					
						<g:sortableColumn property="diffY" title="${message(code: 'accelerometer.diffY.label', default: 'Diff Y')}" />
					
						<g:sortableColumn property="diffZ" title="${message(code: 'accelerometer.diffZ.label', default: 'Diff Z')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${accelerometerInstanceList}" status="i" var="accelerometerInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${accelerometerInstance.id}">${fieldValue(bean: accelerometerInstance, field: "activity")}</g:link></td>
					
						<td>${fieldValue(bean: accelerometerInstance, field: "alt")}</td>
					
						<td>${fieldValue(bean: accelerometerInstance, field: "device")}</td>
					
						<td>${fieldValue(bean: accelerometerInstance, field: "diffX")}</td>
					
						<td>${fieldValue(bean: accelerometerInstance, field: "diffY")}</td>
					
						<td>${fieldValue(bean: accelerometerInstance, field: "diffZ")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${accelerometerInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
