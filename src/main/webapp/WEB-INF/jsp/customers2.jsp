<%--
  Created by IntelliJ IDEA.
  User: Jabrik
  Date: 08/11/2014
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customers Form</title>
    <script type="text/javascript" src="/js/jquery.js"></script>
    <script type="text/javascript" src="/js/bootstrap.js"></script>
    <link type="text/css" href="/css/bootstrap.css" rel="stylesheet"/>
    <script type="text/javascript" src="/js/bootstrap-datepicker.js"></script>
    <link type="text/css" href="/css/datepicker3.css" rel="stylesheet"/>
    <style>
        .error {
            color: #ff0000;
            font-style: italic;
            font-weight: bold;
        }
    </style>

    <script type="text/javascript">
        $(document).ready(function () {
            $('.datepicker').datepicker();
        });
    </script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <h2>Customers2 Form</h2>
            <sf:form commandName="customers2" cssClass="form-horizontal" method="post" action="/customers2/add.htm">
                <div class="form-group">
                    <sf:label path="firstName" cssClass="control-label col-sm-2">FirstName</sf:label>
                    <div class="col-sm-6">
                        <sf:input path="firstName" cssClass="form-control"/>
                        <sf:errors path="firstName" cssClass="error"/>
                    </div>
                </div>

                <div class="form-group">
                    <sf:label path="lastName" cssClass="control-label col-sm-2">Last Name</sf:label>
                    <div class="col-sm-6">
                        <sf:input path="lastName" cssClass="form-control"/>
                        <sf:errors path="lastName" cssClass="error"/>
                    </div>
                </div>

                <div class="form-group">
                    <sf:label path="gender" cssClass="control-label col-sm-2">Gender</sf:label>
                    <div class="col-sm-6">
                        <sf:label path="gender" cssClass="radio-inline"><sf:radiobutton path="gender"
                                                                                        value='M'/>Male
                        </sf:label>

                        <sf:label path="gender" cssClass="radio-inline">
                            <sf:radiobutton path="gender" value='F'/>Female
                        </sf:label>
                    </div>
                </div>

                <div class="form-group">
                    <sf:label path="yearsOfBirth" cssClass="control-label col-sm-2">Years Of Birth</sf:label>
                    <div class="col-sm-6">
                        <sf:select path="yearsOfBirth" cssClass="form-control">
                            <sf:option value="1980" />
                            <sf:option value="1981" />
                            <sf:option value="1982" />
                            <sf:option value="1983" />
                        </sf:select>
                        <sf:errors path="yearsOfBirth" cssClass="error"/>
                    </div>
                </div>

                <div class="form-group">
                    <sf:label path="maritalStatus" cssClass="control-label col-sm-2">Marital Status</sf:label>
                    <div class="col-sm-6">
                        <sf:select path="maritalStatus" cssClass="form-control">
                            <sf:option value="Single" />
                            <sf:option value="Married" />
                        </sf:select>
                    </div>
                </div>

                <div class="form-group">
                    <sf:label path="streetAddress" cssClass="control-label col-sm-2">Street Address</sf:label>
                    <div class="col-sm-6">
                        <sf:input path="streetAddress" cssClass="form-control"/>
                        <sf:errors path="streetAddress" cssClass="error"/>
                    </div>
                </div>

                <div class="form-group">
                    <sf:label path="postalCode" cssClass="control-label col-sm-2">Postal Code</sf:label>
                    <div class="col-sm-6">
                        <sf:input path="postalCode" cssClass="form-control"/>
                        <sf:errors path="postalCode" cssClass="error"/>
                    </div>
                </div>

                <div class="form-group">
                    <sf:label path="city" cssClass="control-label col-sm-2">City</sf:label>
                    <div class="col-sm-6">
                        <sf:input path="city" cssClass="form-control"/>
                        <sf:errors path="city" cssClass="error"/>
                    </div>
                </div>

                <div class="form-group">
                    <sf:label path="cityId" cssClass="control-label col-sm-2">City Id</sf:label>
                    <div class="col-sm-6">
                        <sf:select path="cityId" cssClass="form-control">
                            <sf:option value="1" />Jakarta Selatan
                            <sf:option value="2" />Jakarta Utara
                        </sf:select>
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
</div>
</body>
</html>
