package LinkedList_Java;

public class DoublyLinkedList {

    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 1 };

        DLLNode head = convertArr2DLL(arr);
        // print(head);

        // head = deletDllHead(head);
        // print(head);

        // head = deletDllTail(head);
        // print(head);

        // head = deleteDllKthNode(head, 4);
        // print(head);

        // head = inserDllHeadBefore(head, 4);
        // print(head);

        // head = insertDllBeforeTail(head, 4);
        // print(head);

        // head = insertDllBeforeKthPosition(head, 4, 5);
        // print(head);

        // head = insertHead(head, 4);
        // print(head);

        // head = insertTail(head , 4);
        // print(head);

        // head = insertKthNode(head, 4, 1);
        // print(head);

        // printReverseDLL(head);

        // head = insertionDllNode(head);
        // print(head);
    }

    public static DLLNode print(DLLNode head) {
        DLLNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        return temp;
    }

    public static DLLNode convertArr2DLL(int[] arr) {
        DLLNode head = new DLLNode(arr[0]);
        DLLNode prev = head;
        for (int i = 1; i < arr.length; i++) {
            DLLNode temp = new DLLNode(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static DLLNode deletDllHead(DLLNode head) {
        // head=[A] ⇄ [B] ⇄ [C]=tail

        if (head == null || head.next == null) {
            return null;
        }
        DLLNode prev = head;
        head = head.next; // prev.next;

        head.back = null; // this will remove connection bet old head and new head backward <---
        prev.next = null; // this will remove connection bet old head and new head forward --->

        return head;
    }

    public static DLLNode deletDllTail(DLLNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        DLLNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        DLLNode newTail = tail.back;
        newTail.next = null;
        tail.back = null;

        return head;
    }

    public static DLLNode deleteDllKthNode(DLLNode head, int position) {
        if (head == null) {
            return null;
        }

        DLLNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            // this condition gives me that node, this i want delete , after that loop is
            // break and give that node
            if (count == position) {
                break;
            }
            temp = temp.next;
        }
        DLLNode prev = temp.back;
        DLLNode front = temp.next;

        if (prev == null && front == null) { // for one element in LL
            return null;

        } else if (prev == null) {
            return deletDllHead(head);

        } else if (front == null) {
            return deletDllTail(head);

        } else {
            prev.next = front;
            front.back = prev;
            temp.next = null;
            temp.back = null;
        }
        return head;
    }

    public static DLLNode inserDllHeadBefore(DLLNode head, int val) {
        DLLNode newHead = new DLLNode(val, head, null);
        newHead.next = head;
        head.back = newHead;
        return newHead;
    }

    public static DLLNode insertDllBeforeTail(DLLNode head, int val) {
        DLLNode temp = head;

        while (temp.next.next != null) {

            temp = temp.next;
        }
        DLLNode prev = temp;
        DLLNode newNode = new DLLNode(val, temp.next, prev);
        newNode.back = prev;
        newNode.next = temp.next;
        prev.next = newNode;
        temp.next.back = newNode;
        return head;
    }

    public static DLLNode insertDllBeforeTail2(DLLNode head, int val) {
        DLLNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        DLLNode prev = tail.back;
        DLLNode newNode = new DLLNode(val, tail, prev);
        newNode.back = prev;
        newNode.next = tail;
        prev.next = newNode;
        tail.back = newNode;

        return head;
    }

    public static DLLNode insertDllBeforeKthPosition(DLLNode head, int val, int ind) {
        if (head == null) {
            return new DLLNode(val, null, null);
        }
        DLLNode temp = head;
        int count = 0;
        if (ind == 1) {
            return inserDllHeadBefore(head, val);
        }

        while (temp != null) {
            count++;
            if (count == ind) {
                break;
            }
            temp = temp.next;
        }
        DLLNode prev = temp.back;
        // DLLNode front = temp.next;

        if (temp.next == null) {
            return insertDllBeforeTail(head, val);
        } else {
            DLLNode newNode = new DLLNode(val, temp, prev);
            prev.next = newNode;
            temp.back = newNode;

            newNode.back = prev;
            newNode.next = temp;

        }
        return head;
    }

    // insert after the element

    public static DLLNode insertHead(DLLNode head, int val) {
        if (head == null) {
            return new DLLNode(val, null, null);
        }
        DLLNode front = head.next;
        DLLNode newNode = new DLLNode(val, front, head);
        head.next = newNode;
        newNode.back = head;
        return head;
    }

    public static DLLNode insertTail(DLLNode head, int val) {
        if (head == null) {
            return new DLLNode(val, null, null);
        }
        DLLNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        DLLNode newTail = new DLLNode(val, null, tail);
        tail.next = newTail;
        newTail.back = tail;
        return head;
    }

    public static DLLNode insertKthNode(DLLNode head, int val, int ind) {
        if (head == null) {
            return new DLLNode(val, null, null);
        }
        // if (ind == 1) {
        // return insertHead(head, val);
        // }
        DLLNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == ind) {
                break;
            }
            temp = temp.next;
        }
        DLLNode front = temp.next;
        DLLNode newNode = new DLLNode(val, front, temp);
        temp.next = newNode;
        newNode.back = temp;

        return head;
    }

    // reverse DLL

    public static void printReverseDLL(DLLNode head) {
        if (head == null) {
            return;
        }
        DLLNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.back;
        }
    }

    // public static DLLNode insertionDllNode(DLLNode head) {
    //     return head;00
    // }

    
}