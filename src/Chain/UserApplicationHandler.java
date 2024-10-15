package Chain;

public class UserApplicationHandler extends ProcessHandler {
    @Override
    public void handleRequest(String level) {
        if (level.equals("User")) System.out.println("UserApplicationHandler: Handling user application issue.");
        else super.handleRequest(level);
    }
}

