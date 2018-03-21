<html>
<body>
     <h2 style="text-align:center;">Jersey RESTful Web Application With @FormParam!</h2>
    
<form action="webapi/employee/addEmployee" method="post">
<fieldset>
	<legend><strong>Add Employee</strong></legend>
	<table>
<tr>
<td><label>Id ::</label></td>
<td><input type="text" name="id" placeholder="Type Id Here" /></td>
</tr>
<tr>
<td><label>Name ::</label></td>
<td><input type="text" name="name" placeholder="Type Name Here"/></td>
</tr>
<tr>
<td><label>City ::</label></td>
<td><input type="text" name="city" placeholder="Type city Here"/></td>
</tr>
<tr>
<td><label>Salary ::</label></td>
<td><input type="text" name="salary" placeholder="Type salary Here"/></td>
</tr>
<tr>
<td><input type="submit"/></td>
<td><input type="reset"/></td>
</tr>
</table>
</fieldset>
</form>
 
<br/>    
<p><a href="webapi/employee/getAllEmployees">Get All Employees</a>
   
</body>
</html>
