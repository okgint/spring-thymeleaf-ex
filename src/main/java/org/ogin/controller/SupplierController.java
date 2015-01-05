package org.ogin.controller;

import org.ogin.json.CustomSupplierResponse;
import org.ogin.model.Supplier;
import org.ogin.service.supplier.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Jabrik on 09/11/2014.
 */
@Controller
@RequestMapping("/supplier")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @Autowired
    @Qualifier("supplierValidator")
    private Validator validator;

    @InitBinder
    private void initBinder(WebDataBinder binder) {
        binder.setValidator(validator);
    }
    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        Supplier supplier = new Supplier();
        modelMap.addAttribute("supplier", supplier);

        return "supplier";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@ModelAttribute("supplier") @Valid Supplier supplier, BindingResult bindingResult, ModelMap modelMap) {
        if (bindingResult.hasErrors()) {
            return "supplier";
        }
        else {
            supplierService.add(supplier);
            return "supplierList";
        }

    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody
    CustomSupplierResponse list() {
        List<Supplier> supplierList = supplierService.getAllSupplier();
        CustomSupplierResponse response = new CustomSupplierResponse();
        response.setRows(supplierList);
        response.setRecords(String.valueOf(supplierList.size()));
        response.setPage("1");
        response.setTotal("10");
        return response;

    }

    @RequestMapping(value = "/lists", method = RequestMethod.GET)
    public String lists() {
        return "supplierList";
    }
}
