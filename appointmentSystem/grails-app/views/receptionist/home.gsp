<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to sheffSurgeries | Receptionist</title>
	<asset:stylesheet src="surgeryView.css"/>
</head>
<body>
<div class="view">
<g:loginToggle/>
<asset:image src="calvary-bruce-private.jpg"/>
</div>
<div class="scrollmenu">
  <a ><g:link controller="appointment" action="create">Create Appontment</g:link></a>
  <a ><g:link controller="patient" action="create">Create Patient</g:link></a>
  <a ><g:link controller="doctor" action="create">Create Doctor</g:link></a>
  <a ><g:link controller="nurse" action="create">Create Nurses</g:link></a>
  <a ><g:link controller="surgery" action="create">Create Surgery</g:link></a>
  <a ><g:link controller="receptionist" action="create">Create Receptionist</g:link></a> 
 </div>
<div class="row">
<div class="view" >
<asset:image src="member1.jpg"/>
<asset:image src="member2.jpg"/>
<asset:image src="member3.jpg"/>
<asset:image src="member4.jpg"/>
<asset:image src="member5.jpg"/>
</div>
</div>
</body>
</html>
