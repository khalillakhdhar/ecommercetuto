package com.hql.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Data
public class Commande extends AuditModel implements Serializable {

	@Min(value = 1)
	private int quantite;
	@JsonManagedReference
	@ManyToMany
	List<Client> clients=new ArrayList<Client>();
	@JsonManagedReference
	@ManyToMany
	List<Produit> produits=new ArrayList<Produit>();
	private String etat;
}
