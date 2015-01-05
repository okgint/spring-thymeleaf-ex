package tampung;

import org.ogin.model.Customers;
import org.ogin.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * Created by Jabrik on 07/11/2014.
 */
@Controller
@RequestMapping("/customers")
public class CustomersController {
    @Autowired
    private CustomersService customersService;

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        Customers customers = new Customers();
        modelMap.addAttribute("customers", customers);
        return "customers";
    }

    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public String add(@Valid @ModelAttribute("customers") Customers customers, BindingResult result, ModelMap modelMap) {
        String firstName = customers.getFirstName();
        String lastName = customers.getLastName();

        if (result.hasErrors()) {
            modelMap.addAttribute("customers", customers);
            return "customers";
        }
        else {
            customersService.save(customers);
            return "users";
        }
    }
}
