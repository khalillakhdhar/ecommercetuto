package com.hql.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
public class Client extends AuditModel implements Serializable {

	@Column(nullable = false)
	@NotBlank
	private String nom,prenom;
	@Column(nullable = false)
	private String adresse,password;
	@Email
	@Column(nullable = false,unique = true)
	private String email;
	@Enumerated(EnumType.STRING)
	Grade grade;
	@Enumerated(EnumType.STRING)

	Genre genre;
	@Min(value=16)
	int age;
@JsonBackReference
@ManyToMany(mappedBy = "clients")
@JsonIgnoreProperties({"applications","hibernateLazyInitializer"})

	private Set<Commande> commandes=new HashSet<Commande>();

	
}
