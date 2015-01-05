package org.ogin.service.inventoryItem;

import org.ogin.dao.inventoryItem.InventoryItemDao;
import org.ogin.model.InventoryItem;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Jabrik on 09/11/2014.
 */
public class InventoryItemServiceImpl implements InventoryItemService {
    @Autowired
    private InventoryItemDao inventoryItemDao;

    @Override
    public List<InventoryItem> getAllInventoryItems() {
        return inventoryItemDao.getAllInventoryItems();
    }

    @Override
    public List<InventoryItem> getAllInventoryItemsDetail() {
        return inventoryItemDao.getAllInventoryItemsDetail();
    }

    @Override
    public void add(InventoryItem inventoryItem) {
        inventoryItemDao.add(inventoryItem);
    }

    public InventoryItemDao getInventoryItemDao() {
        return inventoryItemDao;
    }

    public void setInventoryItemDao(InventoryItemDao inventoryItemDao) {
        this.inventoryItemDao = inventoryItemDao;
    }
}
