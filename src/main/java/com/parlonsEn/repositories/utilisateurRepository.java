package com.parlonsEn.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.parlonsEn.models.Utilisateur;



public interface utilisateurRepository extends MongoRepository<Utilisateur, String>{
	
	public Utilisateur findByEmail(String email);

}
