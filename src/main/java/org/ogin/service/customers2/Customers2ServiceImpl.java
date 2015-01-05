package org.ogin.service.customers2;

import org.ogin.dao.customers2.Customers2Dao;
import org.ogin.model.Customers2;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Jabrik on 08/11/2014.
 */
public class Customers2ServiceImpl implements Customers2Service {
    @Autowired
    private Customers2Dao customers2Dao;

    @Override
    public void add(Customers2 customers2) {
        customers2Dao.add(customers2);
    }

    public Customers2Dao getCustomers2Dao() {
        return customers2Dao;
    }

    public void setCustomers2Dao(Customers2Dao customers2Dao) {
        this.customers2Dao = customers2Dao;
    }
}
