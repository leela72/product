package com.idigital.farmerassistant.productms.service;

import com.idigital.farmerassistant.productms.entity.Product;

import java.util.List;

public interface IService {

    Product createProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(long id);
    Product updateProduct(long id, Product product);
    void deleteProduct( long id);
}
