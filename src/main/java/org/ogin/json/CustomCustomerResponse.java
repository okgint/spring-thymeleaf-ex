package org.ogin.json;

import org.ogin.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jabrik on 09/11/2014.
 */
public class CustomCustomerResponse {
    private String page;
    private String total;
    private String records;
    private List<Customer> rows = new ArrayList<Customer>();

    public CustomCustomerResponse() {
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

    public List<Customer> getRows() {
        return rows;
    }

    public void setRows(List<Customer> rows) {
        this.rows = rows;
    }
}
