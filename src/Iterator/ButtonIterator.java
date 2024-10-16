package Iterator;

import Command.Button;

import java.util.Stack;

public class ButtonIterator implements Iterator<Button>{
    private final Stack<TreeNode> stack = new Stack<>();
    public ButtonIterator(TreeNode root) {
        pushLeft(root);
    }
    public void pushLeft(TreeNode node){
        while (node != null){
            stack.push(node);
            node = node.left;
        }
    }
    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Button next() {
        TreeNode node = stack.pop();
        Button button = node.button;
        if (node.right != null){
            pushLeft(node.right);
        }
        return button;
    }
}
