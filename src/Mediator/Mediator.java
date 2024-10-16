package Mediator;

import Chain.ProcessHandler;
import Command.Command;

public interface Mediator {
    void send(Command command, ProcessHandler handler);
}
