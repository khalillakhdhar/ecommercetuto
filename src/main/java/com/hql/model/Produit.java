package com.hql.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Data
public class Produit extends AuditModel implements Serializable {

	@Column(nullable = false)
	private String nom;
	@Column(nullable = false)
	private String description,codeBarre;
	private String photo;
	@Min(value = 1)
	private double prix;
	@Min(value = 0)
	private int quantite;
	@JsonBackReference
	@ManyToMany(mappedBy = "produits")
		private Set<Commande> commandes=new HashSet<Commande>();

}
