package com.pluralsight.NorthwindTradersSpringBoot.dao.interfaces;

import com.pluralsight.NorthwindTradersSpringBoot.models.Product;

import java.util.List;

public interface IProductDAO {

    Product addProduct(Product product);

    List<Product> getAllProducts();

    Product getProductByID(int productID);

    void update(int productID, Product product);

    void delete(int productID);
}
