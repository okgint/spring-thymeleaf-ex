<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<br /><br /><br/>
<script language="javascript">
    <tiles:insertAttribute name="scriptFile"/>
</script>

<table data-toggle="table" data-url="/inventoryItem/list.htm" data-show-refresh="true"
       data-show-toggle="true" data-show-columns="true" data-search="true" data-select-item-name="toolbar1">
    <thead>
    <tr>
        <th data-field="state" data-radio="true">Item ID</th>
        <th data-field="id">Item ID</th>
        <th data-field="description">Description</th>
        <th data-field="price">Item Price</th>
        <th data-field="onhand">Onhand</th>
        <th data-field="supplierId">Supplier_ID</th>
    </tr>
    </thead>
</table>


