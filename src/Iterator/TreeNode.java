package Iterator;

import Command.Button;

public class TreeNode {
    Button button;
    TreeNode left;
    TreeNode right;
    TreeNode(Button button){
        this.button = button;
        this.left = null;
        this.right = null;
    }
}
