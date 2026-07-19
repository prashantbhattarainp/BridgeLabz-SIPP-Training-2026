public class ValidateBST {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static boolean validate(Node root, long min, long max) {

        if (root == null)
            return true;

        if (root.val <= min || root.val >= max)
            return false;

        return validate(root.left, min, root.val)
                &&
                validate(root.right, root.val, max);
    }

    static boolean isValidBST(Node root) {

        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(5);

        root.right = new Node(20);

        root.right.left = new Node(15);

        root.right.right = new Node(30);

        System.out.println(isValidBST(root));
    }
}