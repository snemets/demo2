package ru.lstu.demo2.dto;

import java.util.List;

public class AuthorWithBooksDto extends AuthorDto {
    private List<BookDto> books;

    public List<BookDto> getBooks() {
        return books;
    }

    public void setBooks(List<BookDto> books) {
        this.books = books;
    }
}
