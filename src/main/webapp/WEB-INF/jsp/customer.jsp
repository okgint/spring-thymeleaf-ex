<%--
  Created by IntelliJ IDEA.
  User: Jabrik
  Date: 09/11/2014
  Time: 0:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<br /><br /><br/>
        <div class="container">
            <div class="col-md-12">
                <h1>Customer Form</h1>
                <sf:form cssClass="form-horizontal" commandName="customer" method="post" action="/customer/add.htm">

                    <div class="form-group">
                        <sf:label path="name" for="name" cssClass="control-label col-sm-2">Name </sf:label>
                        <div class="col-sm-6">
                            <sf:input path="name" cssClass="form-control"/>
                            <sf:errors path="name" cssClass="error"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <sf:label path="status" for="name" cssClass="control-label col-sm-2">Status </sf:label>
                        <div class="col-sm-6">
                            <sf:input path="status" cssClass="form-control"/>
                            <sf:errors path="status" cssClass="error"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <sf:label path="webSite" for="webSite" cssClass="control-label col-sm-2">Web Site </sf:label>
                        <div class="col-sm-6">
                            <sf:input path="webSite" cssClass="form-control"/>
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
