package com.hql.controller.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hql.controller.services.ProduitService;
import com.hql.model.Produit;
import com.hql.model.repository.ProduitRepository;
@Service
public class ProduitServiceImplement implements ProduitService {

	@Autowired
	ProduitRepository produitRepository;
	
	
	@Override
	public Produit createOneProduit(Produit produit) {
		// TODO Auto-generated method stub
		return produitRepository.save(produit);
	}

	@Override
	public List<Produit> getAllProduits() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public Produit getOneProduit(int id) {
		// TODO Auto-generated method stub
		return produitRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteOneProduit(int id) {
		// TODO Auto-generated method stub
		produitRepository.deleteById(id);
		
	}

	@Override
	public void deleteAllProduits() {
		// TODO Auto-generated method stub
		produitRepository.deleteAll();
		
	}

	@Override
	public Optional<List<Produit>> findByNomContaining(String nom) {
		// TODO Auto-generated method stub
		return produitRepository.findByNomContaining(nom);
	}

	@Override
	public Optional<List<Produit>> findByDescriptionContaining(String description) {
		// TODO Auto-generated method stub
		return produitRepository.findByDescriptionContaining(description);
	}

	@Override
	public Optional<List<Produit>> findByPrixBetween(double prixMin, double prixMax) {
		// TODO Auto-generated method stub
		return produitRepository.findByPrixBetween(prixMin, prixMax);
	}

	@Override
	public Optional<List<Produit>> findByPrixLessThan(double prix) {
		// TODO Auto-generated method stub
		return produitRepository.findByPrixLessThan(prix);
	}

	@Override
	public Optional<List<Produit>> findByPrixGreaterThan(double prix) {
		// TODO Auto-generated method stub
		return produitRepository.findByPrixGreaterThan(prix);
	}

}
