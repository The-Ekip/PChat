package com.example.demo.app.adapter.mysql.adapter;


import com.example.demo.app.core.boundary.book.BookRepository;
import com.example.demo.app.core.domain.book.Book;

import java.util.HashMap;
import java.util.Map;

public abstract class BookMysqlRepository implements BookRepository {
    Map<Long, Book> books = new HashMap<>();

    public BookMysqlRepository() {
    }

    public Long save(Book book) {
        books.put(book.getId(),book);
        return  book.getId();
    }
}
