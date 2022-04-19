package ru.lstu.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.lstu.demo2.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
