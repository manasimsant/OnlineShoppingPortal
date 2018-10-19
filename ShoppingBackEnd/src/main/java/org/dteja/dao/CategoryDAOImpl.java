package org.dteja.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.dteja.models.Category;
import org.hibernate.SessionF;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addCategory(Category category) {
		try {
			sessionFactory.getCurrentSession().save(category);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteCategory(Category category) {
		try {
			sessionFactory.getCurrentSession().delete(category);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateCategory(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<Category> listCategories() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Category");
		List<Category> listCategories = query.list();
		session.close();
		return listCategories;
	}

	@Override
	public Category getCategory(int categoryid) {
		Session session = sessionFactory.openSession();
		Category category = (Category) session.get(Category.class, categoryid);
		session.close();
		return category;
	}

}
