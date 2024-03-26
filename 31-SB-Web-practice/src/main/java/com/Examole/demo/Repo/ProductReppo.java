package com.Examole.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Examole.demo.Entity.Product;

public interface ProductReppo extends JpaRepository<Product, Long>{

}
