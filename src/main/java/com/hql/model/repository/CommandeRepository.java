package com.hql.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hql.model.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Integer> {

}
