<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Add New Employee</h1>
       <form:form method="post" action="save" modelAttribute="emp">  
      	<table >
      	<tr>  
          <td>eid : </td> 
          <td><form:input type="number" path="eid"  /></td>
         </tr>  
         <tr>  
          <td>Name : </td> 
          <td><form:input path="name"  /></td>
         </tr>  
         <tr>  
          <td>Salary :</td>  
          <td><form:input path="salary" /></td>
         </tr> 
         <tr>  
          <td>Designation :</td>  
          <td><form:input path="designation" /></td>
         </tr> 
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
