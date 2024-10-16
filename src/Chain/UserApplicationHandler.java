package Chain;

import Mediator.Mediator;

public class UserApplicationHandler extends ProcessHandler {
    public UserApplicationHandler(Mediator mediator) {
        super(mediator);
    }
    @Override
    public void handleRequest(String level) {
        if (level.equals("User")) System.out.println("UserApplicationHandler: Handling user application issue.");
        else super.handleRequest(level);
    }
}

