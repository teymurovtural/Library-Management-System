package com.myproject.library.Service.impl;

import com.myproject.library.Entity.Books;
import com.myproject.library.Dto.BooksRequestDto;
import com.myproject.library.Dto.BooksResponseDto;
import com.myproject.library.Exception.NotFoundException;
import com.myproject.library.Mapper.BooksMapper;
import com.myproject.library.Repository.BooksRepository;
import com.myproject.library.Service.BooksService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BooksServiceImpl implements BooksService {

    private final BooksRepository booksRepository;
    private final BooksMapper mapper;

    @Override
    public BooksResponseDto create(BooksRequestDto dto) {
        Books entity = mapper.toEntity(dto);
        return mapper.toDto(booksRepository.save(entity));
    }

    @Override
    public BooksResponseDto getById(Long id) {
        Books book = booksRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Book not found with id: " + id));
        return mapper.toDto(book);
    }

    @Override
    public List<BooksResponseDto> getAll() {
        return booksRepository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public List<BooksResponseDto> getByName(String name) {
        return booksRepository.findByNameContainingIgnoreCase(name)
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public BooksResponseDto update(Long id, BooksRequestDto dto) {
        Books book = booksRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Book not found with id: " + id));

        book.setName(dto.getName());
        book.setPageCount(dto.getPageCount());
        book.setAuthor(dto.getAuthor());
        book.setPrice(dto.getPrice());

        return mapper.toDto(booksRepository.save(book));
    }

    @Override
    public void delete(Long id) {
        Books book = booksRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Book not found with id: " + id));
        booksRepository.delete(book);
    }
}