package Chain;

abstract public class ProcessHandler implements Handler {
    protected ProcessHandler nextHandler;
    public void handleRequest(String level){
        if (nextHandler != null) nextHandler.handleRequest(level);
    }
    public void setNextHandler(ProcessHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
