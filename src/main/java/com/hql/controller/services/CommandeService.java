package com.hql.controller.services;

import java.util.List;
import java.util.Optional;

import com.hql.model.Client;
import com.hql.model.Commande;
import com.hql.model.Produit;

public interface CommandeService {
	public Commande createOneCommande(Commande commande);
	public List<Commande> getAllCommandes();
	public Commande getOneCommande(int id);
	public void deleteOneCommande(int id);
	public void deleteAllCommandes();
	Optional<List<Commande>> findByProduits(int id_produit);
	Optional<List<Commande>> findByClients(int id_client);
	Optional<List<Commande>>  findByQuantiteGreaterThanEqual(int quantite);
}
