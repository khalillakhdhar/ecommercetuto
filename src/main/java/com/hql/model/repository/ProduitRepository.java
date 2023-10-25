package com.hql.model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hql.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {
Optional<List<Produit>>  findByNomContaining(String nom);
Optional<List<Produit>>  findByDescriptionContaining(String description);
Optional<List<Produit>>  findByPrixBetween(double prixMin,double prixMax);
Optional<List<Produit>>  findByPrixLessThan(double prix);
Optional<List<Produit>>  findByPrixGreaterThan(double prix);
}
