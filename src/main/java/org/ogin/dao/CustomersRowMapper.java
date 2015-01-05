package org.ogin.dao;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Jabrik on 08/11/2014.
 */
public class CustomersRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new CustomersExtrator().extractData(rs);
    }
}
