package Chain;

public class SystemProcessHandler extends ProcessHandler {
    @Override
    public void handleRequest(String level) {
        if (level.equals("System")) System.out.println("SystemProcessHandler: Handling system process issue.");
        else super.handleRequest(level);
    }
}
