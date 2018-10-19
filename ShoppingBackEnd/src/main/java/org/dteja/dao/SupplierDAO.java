package org.dteja.dao;

import org.dteja.models.Supplier;

public interface SupplierDAO {
	public boolean addSupplier(Supplier supplier);
	public boolean deleteSupplier(Supplier supplier);
	public boolean updateProduct(Supplier supplier);

}
