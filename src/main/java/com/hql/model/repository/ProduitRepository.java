package com.hql.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hql.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {

}
