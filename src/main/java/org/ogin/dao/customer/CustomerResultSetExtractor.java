package org.ogin.dao.customer;

import org.ogin.model.Customer;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Jabrik on 09/11/2014.
 */
public class CustomerResultSetExtractor implements ResultSetExtractor<Customer> {
    @Override
    public Customer extractData(ResultSet rs) throws SQLException, DataAccessException {
        Customer customer = new Customer();
        customer.setId(rs.getBigDecimal("id"));
        customer.setName(rs.getString("name"));
        customer.setStatus(rs.getString("status"));
        customer.setWebSite(rs.getString("web_site"));
        return customer;
    }
}
