package com.myproject.library.Service;

import com.myproject.library.Dto.BooksRequestDto;
import com.myproject.library.Dto.BooksResponseDto;

import java.util.List;

public interface BooksService {

    BooksResponseDto create(BooksRequestDto dto);

    BooksResponseDto getById(Long id);

    List<BooksResponseDto> getAll();

    List<BooksResponseDto> getByName(String name);

    BooksResponseDto update(Long id, BooksRequestDto dto);

    void delete(Long id);
}