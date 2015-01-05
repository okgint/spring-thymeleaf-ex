package org.ogin.dao.customers2;

import org.ogin.model.Customers2;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Jabrik on 08/11/2014.
 */
public class Customers2RowMapper implements RowMapper<Customers2> {
    @Override
    public Customers2 mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Customers2ResultSetExtractor().extractData(rs);
    }
}
