package com.anaolima.workshopmongo.dto;

import com.anaolima.workshopmongo.domain.User;

import java.io.Serializable;

public class AuthorDTO  implements Serializable {
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
