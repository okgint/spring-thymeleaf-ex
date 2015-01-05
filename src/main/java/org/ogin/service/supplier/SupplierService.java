package org.ogin.service.supplier;

import org.ogin.model.Supplier;

import java.util.List;

/**
 * Created by Jabrik on 09/11/2014.
 */
public interface SupplierService {
    public List<Supplier> getAllSupplier();

    public void add(Supplier supplier);
}
