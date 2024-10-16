package Iterator;

import Command.Button;

public class ButtonCollection implements Aggregate<Button>{
    private TreeNode root;
    public ButtonCollection(){
        root = null;
    }
    public void addButton(Button button){
        root = addRecursive(root, button);
    }
    private TreeNode addRecursive(TreeNode node, Button button){
        if(node == null){
            return new TreeNode(button);
        }
        if (Math.random() > 0.5){
            node.left = addRecursive(node.left, button);
        }
        else{
            node.right = addRecursive(node.right, button);
        }
        return node;
    }


    @Override
    public Iterator<Button> iterator() {
        return new ButtonIterator(root);
    }
}
