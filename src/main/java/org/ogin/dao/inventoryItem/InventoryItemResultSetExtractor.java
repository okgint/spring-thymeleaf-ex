package org.ogin.dao.inventoryItem;

import org.ogin.model.InventoryItem;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Jabrik on 09/11/2014.
 */
public class InventoryItemResultSetExtractor implements ResultSetExtractor<InventoryItem> {
    @Override
    public InventoryItem extractData(ResultSet rs) throws SQLException, DataAccessException {
        InventoryItem item = new InventoryItem();
        item.setId(rs.getBigDecimal("id"));
        item.setDescription(rs.getString("description"));
        item.setPrice(rs.getBigDecimal("price"));
        item.setOnhand(rs.getBigDecimal("onhand"));
        item.setSupplierId(rs.getBigDecimal("supplier_id"));

        return item;
    }
}
