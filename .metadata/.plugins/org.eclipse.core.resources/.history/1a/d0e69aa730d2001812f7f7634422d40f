package org.dteja.controllers;

import java.util.List;

import org.dteja.dao.CategoryDAO;
import org.dteja.dao.ProductDAO;
import org.dteja.models.Category;
import org.dteja.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	CategoryDAO categoryDAO;
	
	boolean flag=true;
	
	@RequestMapping(value="/product")
	public String showManageProduct(Model m)
	{
		Product product=new Product();
		m.addAttribute("product",product);
	
		List<Product> productList=productDAO.listProducts();
		m.addAttribute("listProducts", productList);
		
		List<Category> categoryList=categoryDAO.listCategories();
		m.addAttribute("listCategories", categoryList);
		
		flag=true;
		m.addAttribute("flag", flag);
		return "Product";
	}

}
