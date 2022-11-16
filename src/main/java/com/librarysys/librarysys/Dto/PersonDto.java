package com.librarysys.librarysys.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {

    private int id;
    private String firstname;
    private String lastname;
    private String dob;
    private String address;
    private int number;

}
