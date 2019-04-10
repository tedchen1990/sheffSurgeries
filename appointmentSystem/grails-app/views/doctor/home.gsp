<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to sheffSurgeries | Doctor</title>
	<asset:stylesheet src="surgeryView.css"/>
</head>
<body>
<div class="view">
<g:loginToggle />
<asset:image src="calvary-bruce-private.jpg"/>
</div>
<div class="scrollmenu">
  <g:link controller="prescription" action="create">Create Prescription</g:link></a>
  <a ><g:link controller="prescription" action="index">Prescription</g:link></a>
  <a ><g:link controller="patient" action="index">Patient</g:link></a>
  <a ><g:link controller="appointment" action="index">Appointment</g:link></a>
  </div>
<div class="row">
<asset:image src="member1.jpg"/>
<asset:image src="member2.jpg"/>
<asset:image src="member3.jpg"/>
<asset:image src="member4.jpg"/>
<asset:image src="member5.jpg"/>
</div>
</body>
</html>
