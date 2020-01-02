package com.weverton.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.weverton.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

	@Query("{ 'title': { $regex:  ?0, $options: 'i' }} ")
	List <Post> seracheTitle(String text);
	
	List<Post> findbyTitleContainingIgnoreCase(String text);
	
}
