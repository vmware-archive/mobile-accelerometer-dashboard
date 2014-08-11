
<%@ page import="com.pivotal.fe.mobile.Accelerometer" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'accelerometer.label', default: 'Accelerometer')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-accelerometer" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-accelerometer" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list accelerometer">
			
				<g:if test="${accelerometerInstance?.activity}">
				<li class="fieldcontain">
					<span id="activity-label" class="property-label"><g:message code="accelerometer.activity.label" default="Activity" /></span>
					
						<span class="property-value" aria-labelledby="activity-label"><g:fieldValue bean="${accelerometerInstance}" field="activity"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${accelerometerInstance?.alt}">
				<li class="fieldcontain">
					<span id="alt-label" class="property-label"><g:message code="accelerometer.alt.label" default="Alt" /></span>
					
						<span class="property-value" aria-labelledby="alt-label"><g:fieldValue bean="${accelerometerInstance}" field="alt"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${accelerometerInstance?.device}">
				<li class="fieldcontain">
					<span id="device-label" class="property-label"><g:message code="accelerometer.device.label" default="Device" /></span>
					
						<span class="property-value" aria-labelledby="device-label"><g:fieldValue bean="${accelerometerInstance}" field="device"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${accelerometerInstance?.diffX}">
				<li class="fieldcontain">
					<span id="diffX-label" class="property-label"><g:message code="accelerometer.diffX.label" default="Diff X" /></span>
					
						<span class="property-value" aria-labelledby="diffX-label"><g:fieldValue bean="${accelerometerInstance}" field="diffX"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${accelerometerInstance?.diffY}">
				<li class="fieldcontain">
					<span id="diffY-label" class="property-label"><g:message code="accelerometer.diffY.label" default="Diff Y" /></span>
					
						<span class="property-value" aria-labelledby="diffY-label"><g:fieldValue bean="${accelerometerInstance}" field="diffY"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${accelerometerInstance?.diffZ}">
				<li class="fieldcontain">
					<span id="diffZ-label" class="property-label"><g:message code="accelerometer.diffZ.label" default="Diff Z" /></span>
					
						<span class="property-value" aria-labelledby="diffZ-label"><g:fieldValue bean="${accelerometerInstance}" field="diffZ"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${accelerometerInstance?.lat}">
				<li class="fieldcontain">
					<span id="lat-label" class="property-label"><g:message code="accelerometer.lat.label" default="Lat" /></span>
					
						<span class="property-value" aria-labelledby="lat-label"><g:fieldValue bean="${accelerometerInstance}" field="lat"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${accelerometerInstance?.lon}">
				<li class="fieldcontain">
					<span id="lon-label" class="property-label"><g:message code="accelerometer.lon.label" default="Lon" /></span>
					
						<span class="property-value" aria-labelledby="lon-label"><g:fieldValue bean="${accelerometerInstance}" field="lon"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${accelerometerInstance?.time}">
				<li class="fieldcontain">
					<span id="time-label" class="property-label"><g:message code="accelerometer.time.label" default="Time" /></span>
					
						<span class="property-value" aria-labelledby="time-label"><g:fieldValue bean="${accelerometerInstance}" field="time"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${accelerometerInstance?.xcoord}">
				<li class="fieldcontain">
					<span id="xcoord-label" class="property-label"><g:message code="accelerometer.xcoord.label" default="Xcoord" /></span>
					
						<span class="property-value" aria-labelledby="xcoord-label"><g:fieldValue bean="${accelerometerInstance}" field="xcoord"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${accelerometerInstance?.ycoord}">
				<li class="fieldcontain">
					<span id="ycoord-label" class="property-label"><g:message code="accelerometer.ycoord.label" default="Ycoord" /></span>
					
						<span class="property-value" aria-labelledby="ycoord-label"><g:fieldValue bean="${accelerometerInstance}" field="ycoord"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${accelerometerInstance?.zcoord}">
				<li class="fieldcontain">
					<span id="zcoord-label" class="property-label"><g:message code="accelerometer.zcoord.label" default="Zcoord" /></span>
					
						<span class="property-value" aria-labelledby="zcoord-label"><g:fieldValue bean="${accelerometerInstance}" field="zcoord"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:accelerometerInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${accelerometerInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
