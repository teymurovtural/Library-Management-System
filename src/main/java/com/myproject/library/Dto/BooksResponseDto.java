package com.myproject.library.Dto;

import lombok.Data;

@Data
public class BooksResponseDto {

    private Long id;
    private String name;
    private Integer pageCount;
    private String author;
    private Double price;
}
