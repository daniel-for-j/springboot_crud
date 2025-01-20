package com.daniel.store.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.store.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
