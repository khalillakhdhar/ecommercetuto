package com.hql.controller.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hql.controller.services.ClientService;
import com.hql.model.Client;
import com.hql.model.Genre;
import com.hql.model.repository.ClientRepository;
@Service
public class ClientServiceImplement implements ClientService {

	@Autowired
	ClientRepository clientRepository;
	
	
	
	@Override
	public Client createOneClient(Client client) {
		// TODO Auto-generated method stub
		return clientRepository.save(client);
	}

	@Override
	public List<Client> getAllClients() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

	@Override
	public Client getOneClient(int id) {
		// TODO Auto-generated method stub
		return clientRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteOneClient(int id) {
		// TODO Auto-generated method stub
		if(clientRepository.existsById(id))
		{
			clientRepository.deleteById(id);
		
		}

	}

	@Override
	public void deleteAllClients() {
		// TODO Auto-generated method stub
		clientRepository.deleteAll();

	}

	@Override
	public Optional<List<Client>> findByNomOrPrenom(String nom, String prenom) {
		// TODO Auto-generated method stub
		return clientRepository.findByNomOrPrenom(nom, prenom);
	}

	@Override
	public Optional<Client> findByEmail(String email) {
		// TODO Auto-generated method stub
		return clientRepository.findByEmail(email);
	}

	@Override
	public Optional<List<Client>> findByAgeGreaterThan(int age) {
		// TODO Auto-generated method stub
		return clientRepository.findByAgeGreaterThan(age);
	}

	@Override
	public Optional<List<Client>> findByAgeLessThanEqual(int age) {
		// TODO Auto-generated method stub
		return clientRepository.findByAgeLessThanEqual(age);
	}

	@Override
	public Optional<List<Client>> findByGenre(Genre genre) {
		// TODO Auto-generated method stub
		return clientRepository.findByGenre(genre);
	}

}
