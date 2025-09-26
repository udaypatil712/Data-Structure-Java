package LinkedList_Java;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        Node head = convertarr2LL(arr);

        // System.out.println(head.data); // 1 output=> this will give me first element
        // of LL
        // Node temp = head;

        // while (temp != null) { // 2 output=> this will give all element in LL
        // System.out.print(temp.data);
        // temp = temp.next;
        // }

        // int lengthLL = lengthOfLL(arr); // 3 output=> this will give me length of LL
        // System.out.println("\n" + "length of LL.." + lengthLL);

        // boolean elementPresent=searchInLL(arr); // 4 output => this will give me
        // element is present or not in LL
        // System.out.println(elementPresent);

        // head = removeHead(head);
        // while (head != null) { // 5 output=> this will give except head element in LL
        // System.out.print(head.data + " ");
        // head = head.next;
        // }

        // head=removeTail(head); // 6 output=> this will give except tail element in LL
        // while (head != null) {
        // System.out.print(head.data+" ");
        // head=head.next;
        // }

        // head = removePositionNode(head, 4); // 7 output=> this will give me Kth
        // position of Node/element in LL
        // Node temp = head;
        // while (temp != null) {
        // System.out.print(temp.data + " ");
        // temp = temp.next;
        // }

        // head = removeElementOfNode(head, 6); // 7 output=> this will give me Kth
        // position of Node/element in LL
        // Node temp = head;
        // while (temp != null) {
        // System.out.print(temp.data + " ");
        // temp = temp.next;
        // }

        // head =insertAtHead(head,100);
        // Node temp=head;
        // while (temp != null) {
        // System.out.print(temp.data+" ");
        // temp=temp.next;
        // }

        // head = insertAtTail(head, 200);
        // Node temp = head;
        // while (temp != null) {
        // System.out.print(temp.data + " ");
        // temp = temp.next;
        // }

        // head = insertAtPosition(head, 200, 2);
        // Node temp = head;
        // while (temp != null) {
        // System.out.print(temp.data + " ");
        // temp = temp.next;
        // }

        // head = insertBefElement(head, 200, 1);
        // Node temp = head;
        // while (temp != null) {
        // System.out.print(temp.data + " ");
        // temp = temp.next;
        // }

        head = midElementLL(head);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // 2 output=> this will give all element in LL
    public static Node convertarr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    // 3 output=> this will give me length of LL
    public static int lengthOfLL(int[] arr) {
        Node head = convertarr2LL(arr);
        Node temp = head;
        int lengthOfLLs = 0;
        while (temp != null) {
            temp = temp.next;
            lengthOfLLs++;
        }
        return lengthOfLLs;

    }

    // 4 output => this will give me element is present or not in LL
    public static boolean searchInLL(int[] arr) {
        Node head = convertarr2LL(arr);
        Node temp = head;
        int target = 6;

        while (temp != null) {
            int element = temp.data;
            temp = temp.next;
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    /* Delation of linked List */

    // 5 output=> this will give except head element in LL
    public static Node removeHead(Node head) {
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;

    }

    // 6 output=> this will give except tail element in LL
    public static Node removeTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    // 7 output=> this will give me except Kth position of Node/element in LL
    public static Node removePositionNode(Node head, int k) {
        if (head == null) {
            return head;
        }
        if (k == 1) {
            head = head.next;
            return head;
        }
        int count = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            count++;
            if (k == count) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    // 7 output=> this will give me except that particular node element in LL
    public static Node removeElementOfNode(Node head, int element) {
        if (head == null) {
            return head;
        }
        if (head.data == element) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == element) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    /* Insertion Of Linked List */

    public static Node insertAtHead(Node head, int value) {
        Node temp = new Node(value, head);
        return temp;
    }

    public static Node insertAtTail(Node head, int value) {
        if (head == null) {
            return new Node(value);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(value);
        temp.next = newNode;
        return head;
    }

    public static Node insertAtPosition(Node head, int val, int k) {
        if (head == null) {
            if (k == 1) {
                return new Node(val);
            } else {
                return head;
            }
        }
        if (k == 1) {
            Node temNode = new Node(val, head);
            return temNode;
        }
        Node temp = head;
        int count = 1;
        while (temp != null) {
            if (count == (k - 1)) {
                Node newNode = new Node(val, temp.next);
                temp.next = newNode;
                count++;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node insertBefElement(Node head, int val, int k) {
        if (head == null) {
            return null;
        }
        if (k == head.data) {
            Node temNode = new Node(val, head);
            return temNode;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == k) {
                Node newNode = new Node(val, prev.next);
                prev.next = newNode;
                return head;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    // public static Node midElementLL(Node head) {
        
    // }

}
