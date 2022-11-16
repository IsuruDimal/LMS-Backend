package com.librarysys.librarysys.Repository;

import com.librarysys.librarysys.Entity.BookDetails;
import com.librarysys.librarysys.Entity.PersonBooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface PersonBookRepository extends JpaRepository<PersonBooks, Integer> {

    @Query(value = "select * from person_books where id = ?1" ,nativeQuery = true)
    PersonBooks getRecordByID(String record_id);

    @Modifying
    @Query(value = "delete from person_books where id = ?1", nativeQuery = true)
    void getdeleteidById(String record_id);

    @Query(value = "select r.id r_id, b.id b_id, p.id p_id, b.name name, p.firstname firstname, p.lastname lastname, r.date from person_books r, person_details p, book_details b where r.book_id=b.id and r.person_id=p.id", nativeQuery = true)
    List getRecordDetails();

}




