package org.ogin.dao.customer;

import org.ogin.model.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Jabrik on 09/11/2014.
 */
public class CustomerRowMapper implements RowMapper<Customer> {
    @Override
    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new CustomerResultSetExtractor().extractData(rs);
    }
}
