package org.ogin.service.customer;

import org.ogin.model.Customer;

import java.util.List;

/**
 * Created by Jabrik on 09/11/2014.
 */
public interface CustomerService  {
    public void save(Customer customer);
    public List<Customer> getAllCustomer();
}
