package org.ogin.dao.supplier;

import org.ogin.model.Supplier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Jabrik on 09/11/2014.
 */
public class SupplierResultSetExtractor implements ResultSetExtractor<Supplier> {
    @Override
    public Supplier extractData(ResultSet rs) throws SQLException, DataAccessException {
        Supplier supplier = new Supplier();
        supplier.setId(rs.getBigDecimal("id"));
        supplier.setName(rs.getString("name"));
        supplier.setWebSite(rs.getString("web_site"));
        return supplier;
    }
}
