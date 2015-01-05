<%--
  Created by IntelliJ IDEA.
  User: Jabrik
  Date: 09/11/2014
  Time: 3:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<div class="container">
  <div class="col-md-12">
    <h2>Supplier Form</h2>
    <sf:form method="POST" cssClass="form-horizontal" commandName="supplier" action="/supplier/add.htm">

      <div class="form-group">
        <sf:label path="name" cssClass="col-sm-2 control-label">Name</sf:label>
        <div class="col-md-6">
          <sf:input path="name" cssClass="form-control" />
          <sf:errors path="name" cssClass="error"/>
        </div>
      </div>

      <div class="form-group">
        <sf:label path="webSite" cssClass="col-sm-2 control-label">WebSite</sf:label>
        <div class="col-md-6">
          <sf:input path="webSite" cssClass="form-control" />
          <sf:errors path="webSite" cssClass="error"/>
        </div>
      </div>

      <%--SUBMIT --%>
      <div class="form-group">
        <div class="col-sm-offset-2 col-sm-6">
          <button type="submit" class="btn btn-primary">Submit</button>
          <button type="reset" class="btn btn-default">Clear</button>
        </div>
      </div>

    </sf:form>
  </div>
</div>