package Chain;

import Mediator.Mediator;

public class BackgroundProcessHandler extends ProcessHandler {
    public BackgroundProcessHandler(Mediator mediator) {
        super(mediator);
    }
    @Override
    public void handleRequest(String level) {
        if (level.equals("Background")) System.out.println("BackgroundProcessHandler: Handling background process issue.");
        else super.handleRequest(level);
    }
}
