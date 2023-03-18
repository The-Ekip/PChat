package com.example.demo.app.core.domain.book;
import com.example.demo.library.api.domain.Entity;

public class Book extends Entity {
    @Override
    public Long getId() {
        return super.getId();
    }

    private final String name;
    private final int pageCount;

    public Book(String name, int pageCount) {
        this.name = name;
        this.pageCount = pageCount;
    }
}
