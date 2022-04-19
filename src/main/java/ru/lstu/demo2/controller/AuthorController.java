package ru.lstu.demo2.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.lstu.demo2.entity.Author;
import ru.lstu.demo2.repository.AuthorRepository;

@RestController
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping("/author")
    ResponseEntity<List<Author>> list() {
        return ResponseEntity.ok(authorRepository.findAll());
    }

}
