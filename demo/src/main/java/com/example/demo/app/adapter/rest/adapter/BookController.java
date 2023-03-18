package com.example.demo.app.adapter.rest.adapter;


import com.example.demo.app.core.boundary.book.CreateBookCommand;
import com.example.demo.library.api.boundary.command.CommandBus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class BookController {

    private final CommandBus commandBus;

    public BookController(CommandBus commandBus) {
        this.commandBus = commandBus;
    }

    @PostMapping
    void add(@RequestBody CreateBookRequestBody requestBody) {
        commandBus.execute(new CreateBookCommand(requestBody.name(), requestBody.pageCount()));
    }
}
