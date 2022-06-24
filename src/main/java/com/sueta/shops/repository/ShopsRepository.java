package com.sueta.shops.repository;

import com.sueta.shops.entity.Shops;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopsRepository extends JpaRepository<Shops,Integer> {
    boolean existsByName(String name);

    Shops findByName(String name);
}
