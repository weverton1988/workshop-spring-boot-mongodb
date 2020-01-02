package com.weverton.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weverton.workshopmongo.domain.Post;
import com.weverton.workshopmongo.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		 Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow();
	}
	
	public List<Post> findByTitle(String text) {
		return repo.seracheTitle(text);
	}
}
