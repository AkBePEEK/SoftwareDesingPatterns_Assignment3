package Mediator;

import Chain.*;
import Command.*;

public class Dialog implements Mediator{
    private SystemProcessHandler systemProcessHandler;
    private UserApplicationHandler userApplicationHandler;
    private BackgroundProcessHandler backgroundProcessHandler;
    private ShuttingDownPC shuttingDownPC;
    private TurningOnPC turningOnPC;
    public void setSystemProcessHandler(SystemProcessHandler systemProcessHandler) {
        this.systemProcessHandler = systemProcessHandler;
    }
    public void setUserApplicationHandler(UserApplicationHandler userApplicationHandler) {
        this.userApplicationHandler = userApplicationHandler;
    }
    public void setBackgroundProcessHandler(BackgroundProcessHandler backgroundProcessHandler) {
        this.backgroundProcessHandler = backgroundProcessHandler;
    }
    @Override
    public void send(String message, ProcessHandler handler) {
        if (handler.equals(systemProcessHandler)){
            System.out.println("Mediator directing message to SystemProcessHandler: " + message);
        }
        else if (handler.equals(userApplicationHandler)){
            System.out.println("Mediator directing message to UserApplicationHandler: " + message);
        }
        else if (handler.equals(backgroundProcessHandler)) {
            System.out.println("Mediator directing message to BackgroundProcessHandler: " + message);
        }
    }

    @Override
    public void sendCommand(String message, Command command) {
        if (command.equals(shuttingDownPC)){
            System.out.println("Mediator directing message to shuttingDownPC: " + message + "PC is shutting down.");
        }
        else if (command.equals(turningOnPC)){
            System.out.println("Mediator directing message to turningOnPC: " + message + "PC is turning on.");
        }
    }
}
