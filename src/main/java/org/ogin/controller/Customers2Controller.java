package org.ogin.controller;

import org.ogin.model.Customers;
import org.ogin.model.Customers2;
import org.ogin.service.customers2.Customers2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Jabrik on 08/11/2014.
 */
@Controller
@RequestMapping("/customers2")
public class Customers2Controller {
    @Autowired
    private Customers2Service service;

    @Autowired
    @Qualifier("customers2Validator")
    private Validator validator;

    @InitBinder
    private void initBinder(WebDataBinder binder) {
        binder.setValidator(validator);
    }

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        Customers2 customers2 = new Customers2();
        customers2.setGender("M");
        modelMap.addAttribute("customers2", customers2);
        return "customers2";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@ModelAttribute("customers2") @Valid Customers2 customers2, BindingResult bindingResult, ModelMap modelMap) {
        if (bindingResult.hasErrors()) {
            return "customers2";
        } else {
            service.add(customers2);
            return "listCustomers2";
        }
    }
}
