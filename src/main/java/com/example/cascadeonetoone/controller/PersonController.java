package com.example.cascadeonetoone.controller;

import com.example.cascadeonetoone.model.PersonRequest;
import com.example.cascadeonetoone.model.PersonResponse;
import com.example.cascadeonetoone.service.PersonService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@Log4j2
@RestController
public class PersonController {
    private final PersonService personService;


    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping(value="/persons",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PersonResponse>createPerson(@RequestBody PersonRequest personRequest){
        PersonResponse personResponse = PersonService.createPerson(personRequest);
        return new ResponseEntity<>(personResponse, HttpStatus.OK);

    }
}
