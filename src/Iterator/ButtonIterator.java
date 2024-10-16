package Iterator;

import Command.Button;

public class ButtonIterator implements Iterator<Button>{
    private final Button[] button;
    private int index = 0;
    public ButtonIterator(Button[] button) {
        this.button = button;
    }

    @Override
    public boolean hasNext() {
        if (index >= button.length) {
            return false;
        }
        return button[index] != null;
    }

    @Override
    public Button next() {
        Button b = button[index];
        index++;
        return b;
    }
}
