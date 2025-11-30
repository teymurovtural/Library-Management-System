package com.myproject.library.Mapper;

import com.myproject.library.Entity.Books;
import com.myproject.library.Dto.BooksRequestDto;
import com.myproject.library.Dto.BooksResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BooksMapper {

    Books toEntity(BooksRequestDto dto);

    BooksResponseDto toDto(Books entity);
}
