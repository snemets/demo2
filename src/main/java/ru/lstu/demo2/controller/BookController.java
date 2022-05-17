package ru.lstu.demo2.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.lstu.demo2.dto.BookDto;
import ru.lstu.demo2.mapper.BookMapper;
import ru.lstu.demo2.repository.BookRepository;

@RestController
public class BookController {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public BookController(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    @GetMapping("/book")
    public ResponseEntity<List<BookDto>> getAll() {
        return ResponseEntity.ok(bookMapper.toDto(bookRepository.findAll()));
    }

}
