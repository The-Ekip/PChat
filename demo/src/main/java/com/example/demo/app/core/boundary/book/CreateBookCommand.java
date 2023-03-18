package com.example.demo.app.core.boundary.book;

import com.example.demo.library.api.boundary.command.Command;

public record CreateBookCommand(String name, int pageCount) implements Command<Long> {
}
