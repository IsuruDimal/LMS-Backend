package com.librarysys.librarysys.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class BookDto {

    private int id;
    private String author;
    private String name;
    private String volume;
    private String ref;
}
