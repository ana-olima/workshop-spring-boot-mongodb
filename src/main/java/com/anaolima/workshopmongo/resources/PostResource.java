package com.anaolima.workshopmongo.resources;


import com.anaolima.workshopmongo.domain.Post;

import com.anaolima.workshopmongo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping(value="/posts")
public class PostResource {
	
	@Autowired
	private PostService service;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Optional<Post>> findById(@PathVariable String id){
		return ResponseEntity.ok().body(service.findById(id));
	}
}