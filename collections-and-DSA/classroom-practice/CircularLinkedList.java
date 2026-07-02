class CircularNode {
    int data;
    CircularNode next;

    CircularNode(int data) {
        this.data = data;
    }
}
public class CircularLinkedList {
    public static void main(String[] args) {
        CircularNode head = new CircularNode(10);
        CircularNode second = new CircularNode(20);
        CircularNode third = new CircularNode(30);
        head.next = second;
        second.next = third;
        third.next = head;
        CircularNode temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }
}