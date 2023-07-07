package com.anaolima.workshopmongo.services;

import com.anaolima.workshopmongo.domain.Post;
import com.anaolima.workshopmongo.repository.PostRepository;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class PostService {


	@Autowired
	private PostRepository repo;

	public Optional<Post> findById(String id) {
		var post = repo.findById(id);
		if (post == null){

		}
		return post;
	}
	public List<Post> findByTitle(String text){
		return repo.findByTitleContainingIgnoreCase(text);
	}
}