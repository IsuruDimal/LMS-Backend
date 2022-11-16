package com.librarysys.librarysys.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecordsDto {
    private int r_id;
    private int b_id;
    private int p_id;
    private String name;
    private String firstname;
    private String lastname;
}
