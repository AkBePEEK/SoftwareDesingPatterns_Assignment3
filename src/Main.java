import Chain.*;
import Command.*;
import Mediator.*;


public class Main {
    public static void main(String[] args) {

        // 1.Chain of Responsibility
        ProcessHandler System1 = new SystemProcessHandler();
        ProcessHandler Background = new UserApplicationHandler();
        ProcessHandler User = new BackgroundProcessHandler();

        System1.setNextHandler(Background);
        Background.setNextHandler(User);

        System.out.println("\n");

        System1.handleRequest("System");
        System1.handleRequest("Background");
        System1.handleRequest("User");

        System.out.println("\n");

        Background.handleRequest("System");
        Background.handleRequest("Background");
        Background.handleRequest("User");

        System.out.println("\n");

        User.handleRequest("System");
        User.handleRequest("Background");
        User.handleRequest("User");

        System.out.println("\n");

        //2. Command Pattern

        PC linux = new PC();
        PC windows = new PC();

        Command turnOn1 = new TurningOnPC(linux, "Linux");
        Command turnOn2 = new TurningOnPC(windows, "Windows");
        Button buttonOn1 = new Button(turnOn1);
        Button buttonOn2 = new Button(turnOn2);
        Command turnOf1 = new ShuttingDownPC(linux, "Linux");
        Command turnOf2 = new ShuttingDownPC(windows, "Windows");
        Button buttonOff1 = new Button(turnOf1);
        Button buttonOff2 = new Button(turnOf2);

        buttonOn1.click();
        buttonOn2.click();
        buttonOff1.click();
        buttonOff2.click();

        //3.Mediator

        Mediator dialog = new Dialog();

    }
}