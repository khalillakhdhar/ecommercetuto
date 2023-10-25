package com.hql.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hql.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
