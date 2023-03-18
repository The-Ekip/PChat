package com.example.demo.library.api.boundary.command;

public interface CommandBus {

    <R> R execute(Command<R> command);

}
