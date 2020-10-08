package com.parlonsEn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parlonsEn.models.Utilisateur;
import com.parlonsEn.repositories.utilisateurRepository;

@CrossOrigin
@RestController
@RequestMapping("utilisateur")
public class utilisateurController {

	@Autowired
	private utilisateurRepository repository;
	
	@PostMapping("")
	public Utilisateur save(@RequestBody Utilisateur entity) {
		return this.repository.save(entity);
	}
	
	@GetMapping("/{email}")
	public Utilisateur getUtilisateur(@PathVariable String email) {
		return this.repository.findByEmail(email);
	}
}
