package org.ogin.dao.inventoryItem;

import org.ogin.model.InventoryItem;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Jabrik on 09/11/2014.
 */
public class InventoryItemRowMapper implements RowMapper<InventoryItem> {

    @Override
    public InventoryItem mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new InventoryItemResultSetExtractor().extractData(rs);
    }
}
