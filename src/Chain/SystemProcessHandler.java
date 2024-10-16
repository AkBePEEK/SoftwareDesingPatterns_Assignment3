package Chain;

import Mediator.Mediator;

public class SystemProcessHandler extends ProcessHandler {
    public SystemProcessHandler(Mediator mediator) {
        super(mediator);
    }
    @Override
    public void handleRequest(String level) {
        if (level.equals("System")) System.out.println("SystemProcessHandler: Handling system process issue.");
        else super.handleRequest(level);
    }
}
