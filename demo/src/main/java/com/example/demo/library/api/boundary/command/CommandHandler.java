package com.example.demo.library.api.boundary.command;

public interface CommandHandler <R,C extends Command<R>>{
    R handle(C command);
    Class<C> getCommandType();
}
