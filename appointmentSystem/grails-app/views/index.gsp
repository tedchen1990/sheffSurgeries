<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to sheffSurgeries | Home Page</title>
	<asset:stylesheet src="surgeryView.css"/>
</head>
<body>

<div class="dropdown">
  <button class="dropbtn">Login</button>
  <div class="dropdown-content">
    <a ><g:link controller="receptionist" action="login">Receptionist</g:link></a>
    <a ><g:link controller="doctor" action="login">Doctor</g:link></a>
</div>
</div>
<div class="view">
<h1>Welcome sheffSurgeries</h1>
<br/>
<asset:image src="calvary-bruce-private.jpg"/>
</div>

</body>
</html>
