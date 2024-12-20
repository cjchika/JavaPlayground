package com.cjchika.spring_ecom.service;

import com.cjchika.spring_ecom.EcomExceptions.ProductNotFoundException;
import com.cjchika.spring_ecom.model.Product;
import com.cjchika.spring_ecom.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(int productId) {
        return productRepo.findById(productId).orElseThrow(() -> new ProductNotFoundException("Product not found with Id: " + productId));
    }
}
