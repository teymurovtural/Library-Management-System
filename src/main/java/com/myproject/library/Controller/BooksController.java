package com.myproject.library.Controller;

import com.myproject.library.Dto.BooksRequestDto;
import com.myproject.library.Dto.BooksResponseDto;
import com.myproject.library.Service.BooksService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BooksController {

    private final BooksService booksService;

    @PostMapping("/post")
    public BooksResponseDto create(@Valid @RequestBody BooksRequestDto dto) {
        return booksService.create(dto);
    }

    @GetMapping("/get-all")
    public List<BooksResponseDto> getAll() {
        return booksService.getAll();
    }

    @GetMapping("/search")
    public List<BooksResponseDto> getByName(@RequestParam String name) {
        return booksService.getByName(name);
    }

    @GetMapping("/{id}")
    public BooksResponseDto getById(@PathVariable Long id) {
        return booksService.getById(id);
    }

    @PutMapping("/{id}")
    public BooksResponseDto update(@PathVariable Long id,
                                   @Valid @RequestBody BooksRequestDto dto) {
        return booksService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        booksService.delete(id);
    }
}
