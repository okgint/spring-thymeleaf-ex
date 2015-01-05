package org.ogin.service.customer;

import org.ogin.dao.customer.CustomerDao;
import org.ogin.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Jabrik on 09/11/2014.
 */
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public void save(Customer customer) {
        customerDao.addCustomer(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerDao.getAllCustomer();
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
}
