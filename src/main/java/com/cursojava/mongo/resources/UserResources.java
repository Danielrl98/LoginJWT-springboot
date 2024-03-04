package com.cursojava.mongo.resources;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cursojava.mongo.domain.User;

@RestController
@RequestMapping("/users")

public class UserResources {
    
    @RequestMapping(method=RequestMethod.GET)

    public ResponseEntity<List<User>> findAll(){
        
        User maria = new User(1,"maria","maria@email.com");
        User alex = new User(2,"alex","alex@email.com");

        List<User> list = new ArrayList<User>();

        list.addAll(Arrays.asList(maria,alex));

        return ResponseEntity.ok().body(list);
    }
}
