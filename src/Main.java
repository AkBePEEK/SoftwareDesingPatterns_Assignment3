import Chain.*;
import Command.*;
import Mediator.*;
import Iterator.*;


public class Main {
    public static void main(String[] args) {

        // 1.Chain of Responsibility
        Dialog dialog1 = new Dialog();
        ProcessHandler System1 = new SystemProcessHandler(dialog1);
        ProcessHandler Background = new UserApplicationHandler(dialog1);
        ProcessHandler User = new BackgroundProcessHandler(dialog1);

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
        System.out.println("\n");

        //3.Mediator

        Dialog dialog = new Dialog();
        ProcessHandler sys = new SystemProcessHandler(dialog);
        ProcessHandler user = new UserApplicationHandler(dialog);
        ProcessHandler back = new BackgroundProcessHandler(dialog);
        dialog.setBackgroundProcessHandler(back);
        dialog.setUserApplicationHandler(user);
        dialog.setSystemProcessHandler(sys);
        dialog.send(turnOn1, sys);
        dialog.send(turnOn2, back);
        dialog.send(turnOf1, user);
        dialog.send(turnOf2, back);
        System.out.println("\n");

        //4 Iterator
        Command simpleCommand = () -> System.out.println("Button clicked!");

        Button button1 = new Button(simpleCommand);
        Button button2 = new Button(simpleCommand);
        Button button3 = new Button(simpleCommand);

        ButtonCollection buttonCollection = new ButtonCollection(2);
        buttonCollection.add(button1);
        buttonCollection.add(button2);
        buttonCollection.add(button3);

        Iterator<Button> iterator = buttonCollection.iterator();

        while (iterator.hasNext()) {
            Button button = iterator.next();
            button.click();
        }
    }
}