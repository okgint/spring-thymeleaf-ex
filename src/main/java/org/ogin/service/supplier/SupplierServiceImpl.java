package org.ogin.service.supplier;

import org.ogin.dao.supplier.SupplierDao;
import org.ogin.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Jabrik on 09/11/2014.
 */
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierDao supplierDao;

    @Override
    public List<Supplier> getAllSupplier() {
        return supplierDao.getAllSupplier();
    }

    @Override
    public void add(Supplier supplier) {
        supplierDao.add(supplier);
    }

    public SupplierDao getSupplierDao() {
        return supplierDao;
    }

    public void setSupplierDao(SupplierDao supplierDao) {
        this.supplierDao = supplierDao;
    }
}
