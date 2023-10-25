package com.hql.model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hql.model.Client;
import com.hql.model.Commande;
import com.hql.model.Produit;

public interface CommandeRepository extends JpaRepository<Commande, Integer> {
Optional<List<Commande>> findByProduits(Produit produit);
Optional<List<Commande>> findByClients(Client client);
Optional<List<Commande>>  findByQuantiteGreaterThanEqual(int quantite);


}
