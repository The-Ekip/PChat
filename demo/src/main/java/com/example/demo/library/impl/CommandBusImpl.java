package com.example.demo.library.impl;

import com.example.demo.library.api.boundary.command.Command;
import com.example.demo.library.api.boundary.command.CommandBus;
import com.example.demo.library.api.boundary.command.CommandHandler;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@Component
public class CommandBusImpl implements CommandBus {

    private final Map<Class<?>, CommandHandler> commandHandlerMap;

    public CommandBusImpl(Optional<List<CommandHandler<?,?>>> commandHandlers) {
        commandHandlerMap = new HashMap<>();
        commandHandlers.ifPresent( handlers -> {
            for (CommandHandler<?,?> handler : handlers){
                commandHandlerMap.put(handlers.getClass(),handler);
            }
        } );
    }

    @SuppressWarnings("unchecked")
    public <R> R execute(Command<R> command) {
        CommandHandler commandHandler = commandHandlerMap.get(command.getClass());
        Objects.requireNonNull(commandHandler, "No handler registered for command: " + command);

        return (R) commandHandler.handle(command);
    }


}
