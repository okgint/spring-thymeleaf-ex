package org.ogin.service;

import org.ogin.model.Customers;

import java.util.List;

/**
 * Created by Jabrik on 08/11/2014.
 */
public interface CustomersService {
    public List<Customers> getAllCustomers();

    public void save(Customers customers);
}
