package org.ogin.dao.supplier;

import org.ogin.model.Supplier;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Jabrik on 09/11/2014.
 */
public class SupplierRowMapper implements RowMapper<Supplier> {
    @Override
    public Supplier mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new SupplierResultSetExtractor().extractData(rs);
    }
}
