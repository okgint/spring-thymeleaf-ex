package org.ogin.dao.inventoryItem;

import org.ogin.model.InventoryItem;
import org.ogin.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Jabrik on 09/11/2014.
 */
public class InventoryItemDaoImpl implements InventoryItemDao {
    @Override
    public List<InventoryItem> getAllInventoryItems() {
        String SQL = "SELECT * FROM INVENTORY_ITEM";
        return jdbcTemplate.query(SQL, new InventoryItemRowMapper());
    }

    @Override
    public List<InventoryItem> getAllInventoryItemsDetail() {
        final Map<BigDecimal, InventoryItem> inventoryItems = new HashMap<BigDecimal, InventoryItem>();
        final String SQL = "SELECT i.id, i.description, i.price, i.onhand, i.supplier_id, s.id sid, s.name, s.web_site FROM INVENTORY_ITEM i inner join SUPPLIER s ON i.supplier_id=s.id";
        jdbcTemplate.query(SQL, new RowMapper<InventoryItem>() {
            @Override
            public InventoryItem mapRow(ResultSet rs, int rowNum) throws SQLException {
                BigDecimal iId = rs.getBigDecimal("id");
                InventoryItem ii = inventoryItems.get(iId);
                if (ii == null) {
                    String description = rs.getString("description");
                    BigDecimal price = rs.getBigDecimal("price");
                    BigDecimal onhand = rs.getBigDecimal("onhand");
                    BigDecimal ssid = rs.getBigDecimal("sid");
                    ii = new InventoryItem();
                    ii.setId(iId);
                    ii.setDescription(description);
                    ii.setOnhand(onhand);
                    ii.setPrice(price);
                    ii.setSupplierId(ssid);
                    inventoryItems.put(iId, ii);
                }
                Supplier supplier = new Supplier();
                supplier.setId(rs.getBigDecimal("sid"));
                supplier.setWebSite(rs.getString("web_site"));
                supplier.setName(rs.getString("name"));
                ii.getSuppliers().add(supplier);
                return ii;
            }
        });

        List<InventoryItem> result = new ArrayList<InventoryItem>(inventoryItems.values());
        return result;
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void add(InventoryItem inventoryItem) {
        String SQL = "INSERT INTO INVENTORY_ITEM(id, description, price, onhand, supplier_id)" + "values(?,?,?,?,?)";

        Object params[] = new Object[]{
                queryForId(),
                inventoryItem.getDescription(),
                inventoryItem.getPrice(),
                inventoryItem.getOnhand(),
                inventoryItem.getSupplierId()
        };

        int types[] = new int[]{
                Types.NUMERIC,
                Types.VARCHAR,
                Types.VARCHAR,
                Types.NUMERIC,
                Types.NUMERIC
        };
        jdbcTemplate.update(SQL, params, types);
    }

    private Object queryForId() {
        String SQL = "SELECT inventory_item_seq from dual";
        return jdbcTemplate.query(SQL, new RowMapper<Object>() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                BigDecimal result = rs.getBigDecimal(1);
                return result;
            }
        }).get(0);
    }
}
