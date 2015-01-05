package org.ogin.controller;

import org.ogin.json.CustomCustomerResponse;
import org.ogin.model.Customer;
import org.ogin.model.InventoryItem;
import org.ogin.service.inventoryItem.InventoryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Jabrik on 09/11/2014.
 */
@Controller
@RequestMapping("/inventoryItem")
public class InventoryItemController {
    @Autowired
    private InventoryItemService service;

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        InventoryItem item = new InventoryItem();
        modelMap.addAttribute("inventoryItem", item);
        return "inventoryItem";

    }

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public String detail (ModelMap modelMap) {

        return "inventoryItemDetail";

    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody
    List<InventoryItem> list() {
        List<InventoryItem> list = service.getAllInventoryItems();

        return list;
    }

    @RequestMapping(value = "/listDetail", method = RequestMethod.GET)
    public @ResponseBody
    List<InventoryItem> listDetail() {
        List<InventoryItem> list = service.getAllInventoryItemsDetail();

        return list;
    }
}

