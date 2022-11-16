package com.librarysys.librarysys.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonBookDto {
    private int id;
    private int personId;
    private int bookId;
    private String date;
}
