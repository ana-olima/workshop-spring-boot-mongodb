package com.anaolima.workshopmongo.repository;

import com.anaolima.workshopmongo.domain.Post;
import com.anaolima.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
