class DoublyNode {
    int data;
    DoublyNode prev, next;
    DoublyNode(int data) {
        this.data = data;
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyNode head = new DoublyNode(10);
        DoublyNode second = new DoublyNode(20);
        DoublyNode third = new DoublyNode(30);
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        DoublyNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}