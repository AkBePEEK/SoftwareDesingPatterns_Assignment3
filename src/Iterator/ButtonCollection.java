package Iterator;

import Command.Button;

public class ButtonCollection implements Aggregate<Button>{
    private final Button[] buttons;
    private int currentIndex = 0;
    public ButtonCollection(int size) {
        buttons = new Button[size];
    }
    public void add(Button button) {
        if (currentIndex >= buttons.length) {
            System.out.println("Button list is full");
            return;
        }
        buttons[currentIndex] = button;
        currentIndex++;
    }

    @Override
    public Iterator<Button> iterator() {
        return new ButtonIterator(buttons);
    }
}
