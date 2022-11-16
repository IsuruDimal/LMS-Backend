package com.librarysys.librarysys.Controllers;


import com.librarysys.librarysys.Dto.PersonBookDto;
import com.librarysys.librarysys.Dto.PersonDto;
import com.librarysys.librarysys.Entity.PersonBooks;
import com.librarysys.librarysys.Services.PersonBookServices;
import com.librarysys.librarysys.Services.PersonDetailsService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/home/borrow")

public class PersonBooksController {

    @Autowired
    private PersonBookServices personBookServices;
    @Autowired
    private bookController bookController;
    @Autowired
    private personController personController;

    @GetMapping(value = "/view")
    public List<PersonBooks> viewList(){
    return personBookServices.getPersonBooks();

    }
    @PostMapping(value = "/add")
    public PersonBookDto addList(@RequestBody PersonBookDto personBookDto){
    return personBookServices.savePerson(personBookDto);

    }
    @PutMapping(value = "/update")
    public PersonBookDto updateList(@RequestBody PersonBookDto personBookDto){
        return personBookServices.updatePersonBook(personBookDto);

    }
    @DeleteMapping(value = "/delete")
    public String deleteList(){
        return "delete";

    }

    @GetMapping(value = "/getrecordById/{record_Id}")
    public PersonBookDto getrecordbyId(@PathVariable String record_Id){
       return personBookServices.getRecordbyID(record_Id);


    }

    @DeleteMapping(value = "/deleteRecordById/{record_Id}")
    public boolean deleterecordById(@PathVariable String record_Id){
        personBookServices.deleterecordById(record_Id);
        return true;

    }

    @GetMapping("/getPersonsAndBooks")
    public ResponseEntity getPersonandBooks(){
        List books = bookController.getBook();
        List persons = personController.getPerson();
        HashMap response = new HashMap();
        response.put("books",books);
        response.put("persons",persons);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/getRecordsWithNames")
    public ResponseEntity getRecordsWithNames(){
        List records = personBookServices.getRecordsWithNames();
        return ResponseEntity.ok().body(records);
    }

}
