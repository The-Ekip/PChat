package com.example.demo.app.core.boundary.book;


import com.example.demo.app.core.domain.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Long,Book> {
    Long save(Book book);
}
