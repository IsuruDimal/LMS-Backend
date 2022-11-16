package com.librarysys.librarysys.Repository;

import com.librarysys.librarysys.Entity.BookDetails;
import com.librarysys.librarysys.Entity.PersonBooks;
import com.librarysys.librarysys.Entity.PersonDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface PersonDetailsRepository extends JpaRepository<PersonDetails, Integer> {

    @Query(value = "select * from person_details where id = ?1" ,nativeQuery = true)
    PersonDetails getPersonByID(String person_id);

    @Modifying
    @Query(value = "delete from person_details where id = ?1" , nativeQuery = true)
    void getDeletePersonId(String person_id);





}
