package com.anuarorozco.apirest.repositories;

import com.anuarorozco.apirest.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {



}
