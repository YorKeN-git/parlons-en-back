package com.parlonsEn.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.parlonsEn.models.Conference;

public interface conferenceRepository extends MongoRepository<Conference, String>{

}
