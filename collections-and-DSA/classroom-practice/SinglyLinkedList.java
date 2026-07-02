class SinglyNode {
    int data;
    SinglyNode next;
    SinglyNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SinglyLinkedList {
    public static void main(String[] args) {
        SinglyNode head = new SinglyNode(10);
        head.next = new SinglyNode(20);
        head.next.next = new SinglyNode(30);
        SinglyNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}