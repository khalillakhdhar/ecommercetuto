package com.hql.model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hql.model.Client;
import com.hql.model.Genre;

public interface ClientRepository extends JpaRepository<Client, Integer> {
	Optional<List<Client>> findByNomOrPrenom(String nom,String prenom);
	Optional<Client>  findByEmail(String email);
	Optional<List<Client>> findByAgeGreaterThan(int age);
	Optional<List<Client>> findByAgeLessThanEqual(int age);
	Optional<List<Client>> findByGenre(Genre genre);
}
