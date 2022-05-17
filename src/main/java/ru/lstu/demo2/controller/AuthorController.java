package ru.lstu.demo2.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.lstu.demo2.dto.AuthorWithBooksDto;
import ru.lstu.demo2.mapper.AuthorWithBooksMapper;
import ru.lstu.demo2.repository.AuthorRepository;

@RestController
public class AuthorController {

    private final AuthorRepository authorRepository;
    private final AuthorWithBooksMapper authorMapper;

    public AuthorController(AuthorRepository authorRepository, AuthorWithBooksMapper authorMapper) {
        this.authorRepository = authorRepository;
        this.authorMapper = authorMapper;
    }

    @GetMapping("/author")
    ResponseEntity<List<AuthorWithBooksDto>> list() {
        return ResponseEntity.ok(authorMapper.toWithBooksDto(authorRepository.findAll()));
    }

}
