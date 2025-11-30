package com.myproject.library.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BooksRequestDto {

    @NotBlank(message = "Book name cannot be empty")
    private String name;

    @NotNull(message = "Page count cannot be null")
    private Integer pageCount;

    @NotBlank(message = "Author cannot be empty")
    private String author;

    @NotNull(message = "Price cannot be null")
    private Double price;
}
