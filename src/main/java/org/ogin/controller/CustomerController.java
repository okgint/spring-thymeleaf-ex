package org.ogin.controller;

import org.ogin.json.CustomCustomerResponse;
import org.ogin.model.Customer;
import org.ogin.service.customer.CustomerService;
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
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    @Qualifier("customerValidator")
    private Validator validator;

    @InitBinder
    private void initBinder(WebDataBinder binder) {
        binder.setValidator(validator);
    }

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        Customer customer = new Customer();
        modelMap.addAttribute("customer", customer);
        return "customer";
    }

    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public String add(@ModelAttribute("customer") @Valid Customer customer, BindingResult bindingResult, ModelMap modelMap) {
        if (bindingResult.hasErrors()) {
            return "customer";
        }
        else {
            customerService.save(customer);
            return "customerList";
        }
    }

    @RequestMapping(value = "/lists", method = RequestMethod.GET)
    public String  lists() {
        return "customerList";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody CustomCustomerResponse list() {
        List<Customer> customerList = customerService.getAllCustomer();
        CustomCustomerResponse response = new CustomCustomerResponse();
        response.setRows(customerList);
        response.setRecords(String.valueOf(customerList.size()));
        response.setPage("1");
        response.setTotal("10");

        return response;
    }

}
