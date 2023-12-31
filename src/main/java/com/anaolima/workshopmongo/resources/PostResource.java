package com.anaolima.workshopmongo.resources;


import com.anaolima.workshopmongo.domain.Post;

import com.anaolima.workshopmongo.resources.util.URL;
import com.anaolima.workshopmongo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
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
	@RequestMapping(value="/titlesearch", method=RequestMethod.GET)
	public ResponseEntity<List<Post>> findByTitle(@RequestParam(value="text", defaultValue="")String text) {
		text = URL.decodeParam(text);
		List<Post>list = service.findByTitle(text);
		return ResponseEntity.ok().body(list);

	}
	@RequestMapping(value="/fullsearch", method=RequestMethod.GET)
	public ResponseEntity<List<Post>> fullSearch(
			@RequestParam(value="text", defaultValue="")String text,
			@RequestParam(value="minDate", defaultValue="")String minDate,
			@RequestParam(value="maxDate", defaultValue="")String maxDate){
		text = URL.decodeParam(text);
		Date min = URL.convertDate(minDate, new Date(0L));
		Date max = URL.convertDate(maxDate, new Date());

		List<Post>list = service.fullSearch(text, min, max);
		return ResponseEntity.ok().body(list);

	}
}