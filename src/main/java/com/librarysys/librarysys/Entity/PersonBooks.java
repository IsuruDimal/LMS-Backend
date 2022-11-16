package com.librarysys.librarysys.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonBooks {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int personId;
    private int bookId;
    private String date;

}
