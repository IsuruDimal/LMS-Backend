package com.librarysys.librarysys.Services;

import com.librarysys.librarysys.Dto.BookDto;
import com.librarysys.librarysys.Dto.PersonBookDto;
import com.librarysys.librarysys.Dto.PersonDto;
import com.librarysys.librarysys.Entity.BookDetails;
import com.librarysys.librarysys.Entity.PersonBooks;
import com.librarysys.librarysys.Entity.PersonDetails;
import com.librarysys.librarysys.Repository.PersonDetailsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class PersonDetailsService{

    @Autowired
    private PersonDetailsRepository personDetailsRepo;
    @Autowired
    private ModelMapper modelMapper;

    public List<PersonDetails> getPersons(){
        return personDetailsRepo.findAll();
    }

    public PersonDto savePerson(PersonDto personDto){
    personDetailsRepo.save(modelMapper.map(personDto, PersonDetails.class));
    return personDto;

    }

    public PersonDto updatePerson(PersonDto personDto){
        personDetailsRepo.save(modelMapper.map(personDto, PersonDetails.class));
        return personDto;


    }

    public boolean DeletePerson(PersonDto personDto){
        personDetailsRepo.delete(modelMapper.map(personDto, PersonDetails.class));
        return true;

    }

    public PersonDto getPersonbyID(String person_id){
        PersonDetails persondetails = personDetailsRepo.getPersonByID(person_id);
        return modelMapper.map(persondetails, PersonDto.class);

    }

    public void getDeletePersonId(String person_id){
        personDetailsRepo.getDeletePersonId(person_id);
    }

    public void updateById(String person_id){


    }



}
