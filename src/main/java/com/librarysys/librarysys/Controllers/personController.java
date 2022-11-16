package com.librarysys.librarysys.Controllers;

import com.librarysys.librarysys.Dto.PersonDto;
import com.librarysys.librarysys.Entity.PersonDetails;
import com.librarysys.librarysys.Services.PersonDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/home/person")

public class personController {

    @Autowired
    private PersonDetailsService personDetailsService;

    @GetMapping(value = "/view")
    public List<PersonDetails> getPerson(){
        return personDetailsService.getPersons();

    }
    @PostMapping(value = "/add")
    public PersonDto addPerson(@RequestBody PersonDto personDto){

        return personDetailsService.savePerson(personDto);

    }

    @PutMapping (value = "/update")
    public PersonDto updatePerson(@RequestBody PersonDto personDto){

        return personDetailsService.updatePerson(personDto);

    }

    @DeleteMapping(value = "/delete")
    public String deletePerson(){

        return "Deleted";
    }


    @GetMapping(value = "/getpersonById/{person_id}")
    public PersonDto getpersonById(@PathVariable String person_id){
        System.out.println("called");
        return personDetailsService.getPersonbyID(person_id);
    }

    @DeleteMapping(value = "/deletepersonById/{person_id}")
    public boolean deletepersonById(@PathVariable String person_id){
        personDetailsService.getDeletePersonId(person_id);
        return true;
    }



}
