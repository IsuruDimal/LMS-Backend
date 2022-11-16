package com.librarysys.librarysys.Services;

import com.librarysys.librarysys.Dto.BookDto;
import com.librarysys.librarysys.Dto.PersonBookDto;
import com.librarysys.librarysys.Dto.PersonDto;
import com.librarysys.librarysys.Entity.BookDetails;
import com.librarysys.librarysys.Entity.PersonBooks;
import com.librarysys.librarysys.Entity.PersonDetails;
import com.librarysys.librarysys.Repository.PersonBookRepository;
import com.librarysys.librarysys.Repository.PersonDetailsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@Service
@Transactional

public class PersonBookServices {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PersonBookRepository personBookRepo;

    public List<PersonBooks> getPersonBooks(){
        return personBookRepo.findAll();
    }

    public PersonBookDto savePerson(PersonBookDto personBookDto){
        personBookRepo.save(modelMapper.map(personBookDto, PersonBooks.class));
        return personBookDto;

    }

    public PersonBookDto updatePersonBook(PersonBookDto personBookDto){
        personBookRepo.save(modelMapper.map(personBookDto, PersonBooks.class));
        return personBookDto;


    }

    public boolean DeleteList(PersonBookDto personBookDto){
        personBookRepo.delete(modelMapper.map(personBookDto, PersonBooks.class));
        return true;

    }

    public PersonBookDto getRecordbyID(String record_id){
        PersonBooks personBook = personBookRepo.getRecordByID(record_id);
        return modelMapper.map(personBook, PersonBookDto.class);

    }

    public void deleterecordById(String record_id){
        personBookRepo.getdeleteidById(record_id);


    }

    public List<Map> getRecordsWithNames(){
        List records = personBookRepo.getRecordDetails();
        return records;
    }

}
