package Chain;

import Mediator.Mediator;

abstract public class ProcessHandler implements Handler {
    protected ProcessHandler nextHandler;
    protected Mediator mediator;
    public ProcessHandler(Mediator mediator) {
        this.mediator = mediator;
    }
    public void handleRequest(String level){
        if (nextHandler != null) nextHandler.handleRequest(level);
    }
    public void setNextHandler(ProcessHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
