package com.sergosoft.intergalacticmarketplace.repository;

import com.sergosoft.intergalacticmarketplace.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Long, Product> { }
