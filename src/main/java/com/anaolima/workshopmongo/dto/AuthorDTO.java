package com.anaolima.workshopmongo.dto;

import com.anaolima.workshopmongo.domain.User;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
@JsonSerialize
@JsonDeserialize
public class AuthorDTO implements Serializable{

    private static final long serialVersionUID = 1L;
    private String id;
    private String name;

    public AuthorDTO(){

    }
    public AuthorDTO(User obj){
        id = obj.getId();
        id = obj.getName();
    }
}
