package com.librarysys.librarysys.Services;


import com.librarysys.librarysys.Dto.BookDto;
import com.librarysys.librarysys.Dto.PersonBookDto;
import com.librarysys.librarysys.Dto.PersonDto;
import com.librarysys.librarysys.Entity.BookDetails;
import com.librarysys.librarysys.Entity.PersonBooks;
import com.librarysys.librarysys.Entity.PersonDetails;
import com.librarysys.librarysys.Repository.BookDetailsRepository;
import com.librarysys.librarysys.Repository.PersonDetailsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BookDetailsService {

    @Autowired
    private BookDetailsRepository bookDetailsRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<BookDetails> getBook(){
        return bookDetailsRepo.findAll();
    }

    public BookDto saveBook(BookDto bookDto){
        bookDetailsRepo.save(modelMapper.map(bookDto, BookDetails.class));
        return bookDto;

    }

    public BookDto updateBook(BookDto bookDto){
        bookDetailsRepo.save(modelMapper.map(bookDto, BookDetails.class));
        return bookDto;


    }

    public boolean DeleteBook(BookDto bookDto){
        bookDetailsRepo.delete(modelMapper.map(bookDto, BookDetails.class));
        return true;

    }

    public BookDto getBookbyID(String book_id){
      BookDetails bookdetails = bookDetailsRepo.getBookByID(book_id);
        return modelMapper.map(bookdetails, BookDto.class);

    }

    public void deleteBookbyId(String book_id){

        bookDetailsRepo.getDeleteBookId(book_id);

    }



}
