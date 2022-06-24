package com.sueta.shops.repository;

import com.sueta.shops.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products,Integer> {


}
