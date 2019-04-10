<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to sheffSurgeries | Doctor Login </title>
	<asset:stylesheet src="surgeryView.css"/>
</head>
<body>
<div class="backgroundted">
  <h1>Doctor Login</h1>
</div>
<g:form action="validate">
 <input type="hidden" name="cName" value="${cName}">
 <input type="hidden" name="aName" value="${aName}">
<table>
        <tr class="prop">
          <td class="name">
            <label for="username">User Name:</label>
          </td>
          <td class="value">
            <input type="text" id="username" name="username" value="">
          </td></tr>
        <tr class="prop">
          <td class="name">
            <label for="password">Password:</label>
          </td>
          <td class="value">
            <input type="password" id="password" name="password" value="">
          </td></tr>
        <tr><td></td>
          <td>
            <input type="submit" value="login"/>
          </td></tr>
      </table>
    </g:form>
</body>
</html>
