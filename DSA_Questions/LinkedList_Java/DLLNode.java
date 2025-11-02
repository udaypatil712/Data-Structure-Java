package LinkedList_Java;

public class DLLNode {
    int data;
    DLLNode next;
    DLLNode back;

    DLLNode(int data1, DLLNode next1, DLLNode back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    DLLNode(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}
