// Implement a recursive, post-order traversal of a given binary tree,
// return the list of keys of each node in the tree as it is post-order traversed.

import java.util.ArrayList;
import java.util.List;

public class question14 {

    static class TreeNode {
        int val;
        question14.TreeNode left;
        question14.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, question14.TreeNode left, question14.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    TreeNode root;

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if(root == null)
            return res;
        else {
            res.addAll(postorderTraversal(root.left));
            res.addAll(postorderTraversal(root.right));
            res.add(root.val);
        }

        return res;
    }

    public static void main(String[] args) {
        question14 obj = new question14();
        question14.TreeNode root = new question14.TreeNode(5);
        obj.root = root;
        obj.root.left = new TreeNode(3);
        obj.root.right = new TreeNode(8);
        obj.root.left.left = new TreeNode(1);
        obj.root.left.right = new TreeNode(4);
        obj.root.right.right = new TreeNode(11);

        List list = new ArrayList<>();
        list = obj.postorderTraversal(root);
        list.forEach(System.out::println);
    }
}

