package com.parlonsEn.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document
@Data
public class Conference {
	
	@Id
	private String id;
	private String titre;
	private String description;
	private String dateConference;
	private String heureConference;
	private String urlImg;
	private String createur;
	
	
}
