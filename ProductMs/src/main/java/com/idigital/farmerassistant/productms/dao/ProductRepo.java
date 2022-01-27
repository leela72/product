package com.idigital.farmerassistant.productms.dao;

import com.idigital.farmerassistant.productms.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
}
