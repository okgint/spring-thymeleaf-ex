package org.ogin.dao;

import org.ogin.model.Customers;

import java.util.List;

/**
 * Created by Jabrik on 08/11/2014.
 */
public interface CustomersDao {
    public List<Customers> getAllCustomers();

    public void addCustomer(Customers customers);
}
