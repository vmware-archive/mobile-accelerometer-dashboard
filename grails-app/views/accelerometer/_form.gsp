<%@ page import="com.pivotal.fe.mobile.Accelerometer" %>



<div class="fieldcontain ${hasErrors(bean: accelerometerInstance, field: 'activity', 'error')} required">
	<label for="activity">
		<g:message code="accelerometer.activity.label" default="Activity" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="activity" required="" value="${accelerometerInstance?.activity}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: accelerometerInstance, field: 'alt', 'error')} required">
	<label for="alt">
		<g:message code="accelerometer.alt.label" default="Alt" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="alt" required="" value="${accelerometerInstance?.alt}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: accelerometerInstance, field: 'device', 'error')} required">
	<label for="device">
		<g:message code="accelerometer.device.label" default="Device" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="device" required="" value="${accelerometerInstance?.device}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: accelerometerInstance, field: 'diffX', 'error')} required">
	<label for="diffX">
		<g:message code="accelerometer.diffX.label" default="Diff X" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="diffX" required="" value="${accelerometerInstance?.diffX}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: accelerometerInstance, field: 'diffY', 'error')} required">
	<label for="diffY">
		<g:message code="accelerometer.diffY.label" default="Diff Y" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="diffY" required="" value="${accelerometerInstance?.diffY}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: accelerometerInstance, field: 'diffZ', 'error')} required">
	<label for="diffZ">
		<g:message code="accelerometer.diffZ.label" default="Diff Z" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="diffZ" required="" value="${accelerometerInstance?.diffZ}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: accelerometerInstance, field: 'lat', 'error')} required">
	<label for="lat">
		<g:message code="accelerometer.lat.label" default="Lat" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="lat" required="" value="${accelerometerInstance?.lat}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: accelerometerInstance, field: 'lon', 'error')} required">
	<label for="lon">
		<g:message code="accelerometer.lon.label" default="Lon" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="lon" required="" value="${accelerometerInstance?.lon}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: accelerometerInstance, field: 'time', 'error')} required">
	<label for="time">
		<g:message code="accelerometer.time.label" default="Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="time" required="" value="${accelerometerInstance?.time}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: accelerometerInstance, field: 'xcoord', 'error')} required">
	<label for="xcoord">
		<g:message code="accelerometer.xcoord.label" default="Xcoord" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="xcoord" required="" value="${accelerometerInstance?.xcoord}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: accelerometerInstance, field: 'ycoord', 'error')} required">
	<label for="ycoord">
		<g:message code="accelerometer.ycoord.label" default="Ycoord" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="ycoord" required="" value="${accelerometerInstance?.ycoord}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: accelerometerInstance, field: 'zcoord', 'error')} required">
	<label for="zcoord">
		<g:message code="accelerometer.zcoord.label" default="Zcoord" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="zcoord" required="" value="${accelerometerInstance?.zcoord}"/>

</div>

