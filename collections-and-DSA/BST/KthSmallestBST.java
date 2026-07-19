import java.util.Stack;

public class KthSmallestBST {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static Node insert(Node root, int val) {

        if (root == null)
            return new Node(val);

        if (val < root.val)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);

        return root;
    }

    static int kthSmallest(Node root, int k) {

        Stack<Node> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {

            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();

            k--;

            if (k == 0)
                return root.val;

            root = root.right;
        }

        return -1;
    }

    public static void main(String[] args) {

        Node root = null;

        int[] arr = {50, 30, 70, 20, 40, 60, 80};

        for (int x : arr)
            root = insert(root, x);

        System.out.println(kthSmallest(root, 3));
    }
}