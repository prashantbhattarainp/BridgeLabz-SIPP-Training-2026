public class DeleteBST {

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
        else if (val > root.val)
            root.right = insert(root.right, val);

        return root;
    }

    static Node min(Node root) {

        while (root.left != null)
            root = root.left;

        return root;
    }

    static Node delete(Node root, int key) {

        if (root == null)
            return null;

        if (key < root.val)
            root.left = delete(root.left, key);

        else if (key > root.val)
            root.right = delete(root.right, key);

        else {

            if (root.left == null && root.right == null)
                return null;

            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            Node successor = min(root.right);

            root.val = successor.val;

            root.right = delete(root.right, successor.val);
        }

        return root;
    }

    static void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = null;

        int[] arr = {50, 30, 70, 20, 40, 60, 80};

        for (int x : arr)
            root = insert(root, x);

        root = delete(root, 70);

        inorder(root);
    }
}