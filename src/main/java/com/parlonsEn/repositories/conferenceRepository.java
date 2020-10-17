package com.parlonsEn.repositories;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.parlonsEn.models.Conference;

public interface conferenceRepository extends MongoRepository<Conference, String>{

	public List<Conference> findByDateConference(String dateConference);
	
}
