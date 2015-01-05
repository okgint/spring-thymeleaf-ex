package org.ogin.service;

import org.ogin.dao.CustomersDao;
import org.ogin.model.Customers;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Jabrik on 08/11/2014.
 */
public class CustomersServiceImpl implements CustomersService {
    @Autowired
    private CustomersDao customersDao;

    @Override
    public List<Customers> getAllCustomers() {
        return null;
    }

    @Override
    public void save(Customers customers) {
        customersDao.addCustomer(customers);
    }

    public CustomersDao getCustomersDao() {
        return customersDao;
    }

    public void setCustomersDao(CustomersDao customersDao) {
        this.customersDao = customersDao;
    }
}
