package com.scaler.ProductServiceEcommerce.services;

import com.scaler.ProductServiceEcommerce.exceptions.ProductNotExistsException;
import com.scaler.ProductServiceEcommerce.models.Product;

import java.util.List;

public interface ProductService {

    Product getSingleProduct(Long id) throws ProductNotExistsException;

    List<Product> getAllProducts();

    Product updateProduct(Long id, Product product);

    Product replaceProduct(Long id, Product product);

    Product addNewProduct(Product product);

    boolean deleteProduct(Long id);
}
