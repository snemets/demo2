package ru.lstu.demo2.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import ru.lstu.demo2.dto.BookDto;
import ru.lstu.demo2.entity.Book;

@Mapper(componentModel = "spring", uses = {AuthorMapper.class})
public interface BookMapper {
    BookDto toDto(Book book);

    List<BookDto> toDto(List<Book> book);

    Book toEntity(BookDto bookDto);
}
