package com.example.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PersonService {
    
    @Autowired
    PersonRepository personRepository;
    
    RestTemplate restTemplate = new RestTemplate(); // to exchange information
        
    public PersonResonse getPerson(int personId){
        // URL of Another Service
    	final String uri = "http://localhost:8082/webapitwo/hobby/{personId}";
        
         Map<String, Integer> params = new HashMap<String, Integer>();
         params.put("personId", personId);
         // Fetch hobbies from another Service
         String result = restTemplate.getForObject(uri, String.class, params);
         
         //Find Record of a Person
         PersonEntity pe=personRepository.findById(personId).get();
         
         // Add Personal Information and Hobbies together in Person Respons
         PersonResonse pr=new PersonResonse();
         pr.setPersonId(pe.getPersonId());
         pr.setName(pe.getName());
         pr.setAge(pe.getAge());
         pr.setHobby(result);
        
        return pr;
    }   
    public void addPerson(PersonEntity pe){
        personRepository.save(pe);
    }
}


