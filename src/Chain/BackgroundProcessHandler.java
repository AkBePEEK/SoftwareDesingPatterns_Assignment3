package Chain;

public class BackgroundProcessHandler extends ProcessHandler {
    @Override
    public void handleRequest(String level) {
        if (level.equals("Background")) System.out.println("BackgroundProcessHandler: Handling background process issue.");
        else super.handleRequest(level);
    }
}
