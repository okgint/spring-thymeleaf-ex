package org.ogin.json;

import org.ogin.model.Customer;
import org.ogin.model.Supplier;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jabrik on 09/11/2014.
 */
public class CustomSupplierResponse {
    private String page;
    private String total;
    private String records;
    private List<Supplier> rows;

    public CustomSupplierResponse() {
        rows = new ArrayList<Supplier>();
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getRecords() {
        return records;
    }

    public void setRecords(String records) {
        this.records = records;
    }

    public List<Supplier> getRows() {
        return rows;
    }

    public void setRows(List<Supplier> rows) {
        this.rows = rows;
    }
}
