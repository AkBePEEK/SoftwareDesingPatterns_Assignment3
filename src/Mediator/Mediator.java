package Mediator;

import Chain.ProcessHandler;
import Command.Command;

public interface Mediator {
    void send(String message, ProcessHandler handler);
    void sendCommand(String message, Command command);
}
