package com.example.demo.app.core.boundary.book;

import com.example.demo.app.core.domain.book.Book;
import com.example.demo.library.api.boundary.command.CommandHandler;

public class CreateBookCommandHandler implements CommandHandler<Long,CreateBookCommand> {

    private final BookRepository bookRepository;

    public CreateBookCommandHandler(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Long handle(CreateBookCommand command) {
        return bookRepository.save(new Book(command.name(), command.pageCount()));
    }

    @Override
    public Class<CreateBookCommand> getCommandType() {
        return CreateBookCommand.class;
    }
}
