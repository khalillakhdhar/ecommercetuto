package com.hql.controller.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hql.controller.services.CommandeService;
import com.hql.model.Client;
import com.hql.model.Commande;
import com.hql.model.Produit;
import com.hql.model.repository.ClientRepository;
import com.hql.model.repository.CommandeRepository;
import com.hql.model.repository.ProduitRepository;
@Service
public class CommandeServiceImplement implements CommandeService {
@Autowired
	CommandeRepository commandeRepository;
@Autowired
	ProduitRepository produitRepository;
@Autowired
	ClientRepository clientRepository;
	
	
	@Override
	public Commande createOneCommande(Commande commande) {
		// TODO Auto-generated method stub
		return commandeRepository.save(commande);
	}

	@Override
	public List<Commande> getAllCommandes() {
		// TODO Auto-generated method stub
		return commandeRepository.findAll();
	}

	@Override
	public Commande getOneCommande(int id) {
		// TODO Auto-generated method stub
		return commandeRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteOneCommande(int id) {
		// TODO Auto-generated method stub
		 commandeRepository.deleteById(id);

	}

	@Override
	public void deleteAllCommandes() {
		// TODO Auto-generated method stub
		commandeRepository.deleteAll();

	}



	@Override
	public Optional<List<Commande>> findByQuantiteGreaterThanEqual(int quantite) {
		// TODO Auto-generated method stub
		return commandeRepository.findByQuantiteGreaterThanEqual(quantite);
	}

	@Override
	public Optional<List<Commande>> findByProduits(int id_produit) {
		// TODO Auto-generated method stub
		Produit produit=produitRepository.findById(id_produit).orElse(null);
		if(produit!=null)
		return commandeRepository.findByProduits(produit);
		
		return null;
		
	}

	@Override
	public Optional<List<Commande>> findByClients(int id_client) {
		// TODO Auto-generated method stub
		Client client=clientRepository.findById(id_client).orElse(null);
		if(client!=null)
			return commandeRepository.findByClients(client);
		else
			return null;
		
	}

}
