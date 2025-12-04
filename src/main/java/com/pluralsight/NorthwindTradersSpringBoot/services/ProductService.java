package com.pluralsight.NorthwindTradersSpringBoot.services;

import com.pluralsight.NorthwindTradersSpringBoot.dao.interfaces.IProductDAO;
import com.pluralsight.NorthwindTradersSpringBoot.models.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService {
    private IProductDAO productDAO;

    @Autowired
    public ProductService(IProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public Product addProduct(Product product) {
        return productDAO.addProduct(product);
    }

    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }

    public Product getProductById(int productId) {
        return productDAO.getProductByID(productId);
    }

    public void updateProduct(int productId, Product product) {
        productDAO.update(productId, product);
    }

    public void deleteProduct(int productId) {
        productDAO.delete(productId);
    }
}
