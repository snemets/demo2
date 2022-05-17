package ru.lstu.demo2.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.lstu.demo2.dto.AuthorDto;
import ru.lstu.demo2.entity.Author;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
    AuthorDto toDto(Author author);

    @Mapping(target = "books", ignore = true)
    Author toEntity(AuthorDto authorDto);
}
