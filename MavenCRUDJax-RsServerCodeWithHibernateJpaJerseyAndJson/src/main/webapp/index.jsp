<html>
<body>
    <h2 style="text-align:center;">Jersey RESTful CRUD Web Application With Maven Hibernate Jpa!</h2>
  
<form action="http://localhost:8080/MavenCRUDJax-RsServerCodeWithHibernateJpaJerseyAndJson/webapi/employeeWebService/add" method="post">
<fieldset>
<legend><strong>Add Employee</strong></legend>
<table>
<tr>
<td><label>Name ::</label></td>
<td><input type="text" name="name" placeholder="Type Name Here" /></td>
</tr>
<tr>
<td><label>Salary ::</label></td>
<td><input type="text" name="salary" placeholder="Type Salary Here"/></td>
</tr>
<tr>
<td><input type="submit"/></td>
<td><input type="reset"/></td>
</tr>
</table>
</fieldset>
</form>

<br />
<form action="http://localhost:8080/MavenCRUDJax-RsServerCodeWithHibernateJpaJerseyAndJson/webapi/employeeWebService/update" method="post">
<fieldset>
<legend><strong>Update Employee</strong></legend>
<table>
<tr>
<td><label>Name ::</label></td>
<td><input type="text" name="name" placeholder="Type Name Here" /></td>
</tr>
<tr>
<td><label>Salary ::</label></td>
<td><input type="text" name="salary" placeholder="Type Salary Here"/></td>
</tr>
<tr>
<td><label>Id ::</label></td>
<td><input type="text" name="id" placeholder="Type Id Here"/></td>
</tr>
<tr>
<td><input type="submit"/></td>
<td><input type="reset"/></td>
</tr>
</table>
</fieldset>
</form>

<h4><a href="http://localhost:8080/MavenCRUDJax-RsServerCodeWithHibernateJpaJerseyAndJson/webapi/employeeWebService/delete/">
Delete Employee [add id at the end of path to delete]
</a>
</h4>

<h4><a href="http://localhost:8080/MavenCRUDJax-RsServerCodeWithHibernateJpaJerseyAndJson/webapi/employeeWebService/getAll">
Get All Employees Details
</a>
</h4>

</body>
</html>
