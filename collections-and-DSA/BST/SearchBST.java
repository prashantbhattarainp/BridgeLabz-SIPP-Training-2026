public class SearchBST {

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

    static boolean search(Node root, int target) {

        while (root != null) {

            if (root.val == target)
                return true;

            if (target < root.val)
                root = root.left;
            else
                root = root.right;
        }

        return false;
    }

    public static void main(String[] args) {

        Node root = null;

        int[] arr = {50, 30, 70, 20, 40, 60, 80};

        for (int x : arr)
            root = insert(root, x);

        System.out.println(search(root, 40));
        System.out.println(search(root, 90));
    }
}