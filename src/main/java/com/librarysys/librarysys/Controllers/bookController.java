package com.librarysys.librarysys.Controllers;


import com.librarysys.librarysys.Dto.BookDto;
import com.librarysys.librarysys.Entity.BookDetails;
import com.librarysys.librarysys.Repository.BookDetailsRepository;
import com.librarysys.librarysys.Services.BookDetailsService;
import com.librarysys.librarysys.Services.PersonDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping(value = "api/home/book")


public class bookController {

    @Autowired
    private BookDetailsRepository bookDetailsRepository;

    @Autowired
    private BookDetailsService bookDetailsService;

    @GetMapping(value = "/view")
    public List<BookDetails> getBook(){
        return bookDetailsRepository.findAll();
    }

    @PostMapping ( value = "/add")
    public BookDto addBook(@RequestBody BookDto bookDto){
       return bookDetailsService.saveBook(bookDto);
    }

    @PutMapping (value = "/update")
    public BookDto updateBook(@RequestBody BookDto bookDto){

        return bookDetailsService.updateBook(bookDto);

    }

    @DeleteMapping(value = "/delete")
    public String deleteBook(){

        return "deleted";
    }

    @GetMapping("/getBookbyId/{bookId}")
    public BookDto getBookbyID(@PathVariable String bookId){
        return bookDetailsService.getBookbyID(bookId);

    }

    @DeleteMapping(value = "deleteBookbyId/{bookId}")
    public boolean deletebookbyId(@PathVariable String bookId){
        bookDetailsService.deleteBookbyId(bookId);
        return true;
    }

}
