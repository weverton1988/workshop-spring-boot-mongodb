package com.weverton.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.weverton.workshopmongo.domain.Post;
import com.weverton.workshopmongo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

	void save(List<User> asList);
	
}
