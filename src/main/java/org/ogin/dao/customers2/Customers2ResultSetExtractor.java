package org.ogin.dao.customers2;

import org.ogin.model.Customers2;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Jabrik on 08/11/2014.
 */
public class Customers2ResultSetExtractor implements ResultSetExtractor<Customers2> {
    @Override
    public Customers2 extractData(ResultSet rs) throws SQLException, DataAccessException {
        Customers2 customers2 = new Customers2();
        customers2.setId(rs.getBigDecimal("CUST_ID"));
        customers2.setFirstName(rs.getString("CUST_FIRST_NAME"));
        customers2.setLastName(rs.getString("CUST_LAST_NAME"));
        customers2.setGender(rs.getString("CUST_GENDER"));

        return customers2;
    }
}
