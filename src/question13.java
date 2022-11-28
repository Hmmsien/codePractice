// Given an array that is initially stored in one stack,
// sort it with one additional stacks (total 2 stacks).
// After sorting the original stack should contain the sorted integers
// and from top to bottom the integers are sorted in ascending order.

import java.util.ArrayList;
import java.util.List;

class question13 {
    static class TreeNode {
        int val;
        question13.TreeNode left;
        question13.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, question13.TreeNode left, question13.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    TreeNode root;

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        return preorder(root, res);
    }

    public List<Integer> preorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }
        list.add(root.val);

        preorder(root.left, list);
        preorder(root.right, list);

        return list;
    }

    public static void main(String[] args) {
        question13 obj = new question13();
        question13.TreeNode root = new question13.TreeNode(5);
        obj.root = root;
        obj.root.left = new question13.TreeNode(3);
        obj.root.right = new TreeNode(8);
        obj.root.left.left = new TreeNode(1);
        obj.root.left.right = new TreeNode(4);
        obj.root.right.right = new TreeNode(11);

        List list = new ArrayList<>();
        list = obj.preorderTraversal(root);
        list.forEach(System.out::println);
    }
}

