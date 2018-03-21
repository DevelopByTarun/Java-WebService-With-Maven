<html>
<body>
    <h2 style="text-align:center;">Jersey RESTful CRUD Web Application With Maven!</h2>
    
<form action="http://localhost:8080/MavenCRUDJax-RsServerCodeWithJerseyAndJson/webapi/studentWebService/add" method="post">
<fieldset>
<legend><strong>Add Student</strong></legend>
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
<td><label>Age ::</label></td>
<td><input type="text" name="age" placeholder="Type Age Here"/></td>
</tr>
<tr>
<td><label>City ::</label></td>
<td><input type="text" name="city" placeholder="Type City Here"/></td>
</tr>
<tr>
<td><input type="submit"/></td>
<td><input type="reset"/></td>
</tr>
</table>
</fieldset>
</form>
    
<br />
<form action="http://localhost:8080/MavenCRUDJax-RsServerCodeWithJerseyAndJson/webapi/studentWebService/get" method="get">
<fieldset>
<legend><strong>Get Student By Id</strong></legend>
<table>
<tr>
<td><label>Id ::</label></td>
<td><input type="text" name="id" placeholder="Type Id Here" /></td>
</tr>
<tr>
<td><input type="submit"/></td>
<td><input type="reset"/></td>
</tr>
</table>
</fieldset>
</form>
    
<h4><a href="http://localhost:8080/MavenCRUDJax-RsServerCodeWithJerseyAndJson/webapi/studentWebService/delete/1">
Delete Student Details By Id
</a>
</h4>    
    
   
<h4><a href="http://localhost:8080/MavenCRUDJax-RsServerCodeWithJerseyAndJson/webapi/studentWebService/getAll">
Get All Students Details
</a>
</h4>
       
</body>
</html>
