package ru.lstu.demo2.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import ru.lstu.demo2.dto.AuthorWithBooksDto;
import ru.lstu.demo2.entity.Author;

@Mapper(componentModel = "spring", uses = BookMapper.class)
public interface AuthorWithBooksMapper {

    AuthorWithBooksDto toWithBooksDto(Author author);

    List<AuthorWithBooksDto> toWithBooksDto(List<Author> author);
}
