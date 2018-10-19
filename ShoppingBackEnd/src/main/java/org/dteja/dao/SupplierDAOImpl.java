package org.dteja.dao;

import javax.transaction.Transactional;

import org.dteja.models.Supplier;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addSupplier(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().save(supplier);
			return true;

		} catch (Exception e) {

			return false;

		}
	}

	@Override
	public boolean deleteSupplier(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().delete(supplier);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateProduct(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().update(supplier);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

}
