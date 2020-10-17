package com.parlonsEn.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Utilisateur {
	
	@Id
	private String id;
	private String prenom;
	private String nom;
	private String userName;
	@Indexed(unique = true)
	private String email;
	private String mdp;
	

}
