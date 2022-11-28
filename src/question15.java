// Find the height of binary tree.

public class question15 {

    static class TreeNode {
        int val;
        question15.TreeNode left;
        question15.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, question15.TreeNode left, question15.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    question15.TreeNode root;

    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        question15 obj = new question15();
        question15.TreeNode root = new question15.TreeNode(5);
        obj.root = root;
        obj.root.left = new question15.TreeNode(3);
        obj.root.right = new question15.TreeNode(8);
        obj.root.left.left = new question15.TreeNode(1);
        obj.root.left.right = new question15.TreeNode(4);
        obj.root.right.right = new question15.TreeNode(11);

        int height = obj.maxDepth(root);
        System.out.println(height);
    }
}
