package org.ogin.dao.customer;

import org.ogin.model.Customer;

import java.util.List;

/**
 * Created by Jabrik on 09/11/2014.
 */
public interface CustomerDao {
    public void addCustomer(Customer customer);
    public List<Customer> getAllCustomer();
}
