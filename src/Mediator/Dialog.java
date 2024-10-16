package Mediator;

import Chain.*;
import Command.*;

public class Dialog implements Mediator{
    private ProcessHandler systemProcessHandler;
    private ProcessHandler userApplicationHandler;
    private ProcessHandler backgroundProcessHandler;
    public void setSystemProcessHandler(ProcessHandler systemProcessHandler) {
        this.systemProcessHandler = systemProcessHandler;
    }
    public void setUserApplicationHandler(ProcessHandler userApplicationHandler) {
        this.userApplicationHandler = userApplicationHandler;
    }
    public void setBackgroundProcessHandler(ProcessHandler backgroundProcessHandler) {
        this.backgroundProcessHandler = backgroundProcessHandler;
    }
    @Override
    public void send(Command command, ProcessHandler handler) {
        if (handler == systemProcessHandler)
            System.out.println("Mediator directing message to SystemProcessHandler.");
        else if (handler == userApplicationHandler)
            System.out.println("Mediator directing message to UserApplicationHandler.");
        else if (handler == backgroundProcessHandler)
            System.out.println("Mediator directing message to BackgroundProcessHandler.");
        command.execute();
    }
}
