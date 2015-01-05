package org.ogin.dao.inventoryItem;

import org.ogin.model.InventoryItem;

import java.util.List;

/**
 * Created by Jabrik on 09/11/2014.
 */
public interface InventoryItemDao {
    public List<InventoryItem> getAllInventoryItems();
    public List<InventoryItem> getAllInventoryItemsDetail();
    public void add(InventoryItem inventoryItem);
}
