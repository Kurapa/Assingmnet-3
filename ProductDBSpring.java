package com.gnaneswar.demo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDB extends JpaRepository<Product,Integer>{
    public Product findByName(String name);
    public List<Product> findAllByPlace(String Place);

}

