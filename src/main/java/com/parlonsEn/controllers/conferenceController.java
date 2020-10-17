package com.parlonsEn.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parlonsEn.models.Conference;
import com.parlonsEn.repositories.conferenceRepository;

@CrossOrigin
@RestController
@RequestMapping("conference")
public class conferenceController {

	@Autowired
	private conferenceRepository repository;
	
	@PostMapping("/add")
	public Conference save(@RequestBody Conference entity) {
		return this.repository.save(entity);
	}
	
	@GetMapping("/search/{jj}/{mm}/{aaaa}")
	public List<Conference> getListConferenceByDate(@PathVariable String jj, @PathVariable String mm, @PathVariable String aaaa){
		return this.repository.findByDateConference(jj + '/' + mm + '/' + aaaa );
	}
	
	@GetMapping("/getAll")
	public List<Conference> getAllConference(){
		return this.repository.findAll();
	}
	
}
