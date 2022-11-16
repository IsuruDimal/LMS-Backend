package com.librarysys.librarysys.Repository;

import com.librarysys.librarysys.Entity.BookDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface BookDetailsRepository extends JpaRepository<BookDetails,Integer> {

    @Query(value = "select * from book_details where id = ?1" ,nativeQuery = true)
    BookDetails getBookByID(String book_id);

    @Modifying
    @Query(value = "delete from book_details where id = ?1", nativeQuery = true)
    void getDeleteBookId(String book_id);


}
