package com.hql.controller.services;

import java.util.List;
import java.util.Optional;

import com.hql.model.Client;
import com.hql.model.Genre;

public interface ClientService {
	public Client createOneClient(Client client);
	public List<Client> getAllClients();
	public Client getOneClient(int id);
	public void deleteOneClient(int id);
	public void deleteAllClients();
	Optional<List<Client>> findByNomOrPrenom(String nom,String prenom);
	Optional<Client>  findByEmail(String email);
	Optional<List<Client>> findByAgeGreaterThan(int age);
	Optional<List<Client>> findByAgeLessThanEqual(int age);
	Optional<List<Client>> findByGenre(Genre genre);
}
