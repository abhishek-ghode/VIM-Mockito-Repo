<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%@page errorPage="WEB-INF/showErrorMessage.jsp" %><html><head>  <link rel="stylesheet" type="text/css" href="default.css"></head><body>	<p><%@include file="showImage.jsp"%></p>
  <p><a href="controller?action=viewCarList">[Return to List]</a></p>
      
  <form method="post" action="controller">
  <input type="hidden" name="action" value="saveCar" />
  <input type="hidden" name="id" value="<%-- Set this value to id property of car attribute --%>" />

  <table>
    <!-- input fields -->    <tr>      <td>Make<font color="red"><sup>*</sup></font> </td>
      <td><input type="text" name="make"  value="<%-- Set this value to make property of car attribute --%>" /></td>
    </tr>  
    <tr>        <td>Model</td>
      <td><input type="text" name="model" value="<%-- Set this value to model property of car attribute --%>" /></td>
    </tr>
    <tr>      <td class="model-year">Model Year</td>
      <td><input type="text" name="modelYear" value="<%-- Set this value to modelYear property of car attribute --%>" /></td>
    </tr>
    
    <!-- Save/Reset buttons -->
    <tr>
      <td colspan="2">
        <input type="submit" name="save" value="Save" /> 
        &nbsp;&nbsp;
        <input type="reset" name="reset" value="Reset" />
      </td>
    </tr>                  </table>
  </form></body></html>