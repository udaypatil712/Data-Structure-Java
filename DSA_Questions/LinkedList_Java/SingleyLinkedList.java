package LinkedList_Java;

public class SingleyLinkedList {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };

        Node head = convertArr2LL(arr);

        // Node temp = head;
        // while (temp != null) {
        // System.out.print(temp.data + " ");
        // temp = temp.next;
        // }

        // int lengthLL = lengthOfLL(head);
        // System.out.println(lengthLL);

        // boolean isPresent = searchInLL(head, 39);
        // System.out.println(isPresent);

        // Node temp = deleteHead(head);
        // while (temp != null) {
        // System.out.println(temp.data);
        // temp=temp.next;
        // }

        // Node temp = deleteTail(head);
        // while (temp != null) {
        // System.out.print(temp.data + " ");
        // temp = temp.next;
        // }

        // Node temp = deletePositionNode(head, 1);
        // while (temp != null) {
        // System.out.println(temp.data);
        // temp = temp.next;
        // }

        // Node temp = insertedHead(head, 9);
        // while (temp != null) {
        // System.out.println(temp.data);
        // temp = temp.next;
        // }

        // Node temp = insertedTail(head, 8);
        // while (temp != null) {
        // System.out.println(temp.data);
        // temp = temp.next;
        // }

        // Node temp = insertedKthPosition2(head, 23, 2);
        // while (temp != null) {
        // System.out.println(temp.data);
        // temp = temp.next;
        // }

        // Node temp = insertAfterKthNode(head, 4, 2);
        // while (temp != null) {
        // System.out.println(temp.data);
        // temp = temp.next;
        // }

        // printReverse(head);

        // Node temp = reverseLL(head);
        // while (temp != null) {
        // System.out.println(temp.data);
        // temp = temp.next;
        // }

        // Node temp = oddEvenList(head);
        // while (temp != null) {
        // System.out.println(temp.data);
        // temp = temp.next;
        // }

        // Node temp = sortedLL012(head);
        // while (temp != null) {
        // System.out.println(temp.data);
        // temp = temp.next;
        // }

        // Node temp = reverse(head);
        // while (temp != null) {
        // System.out.println(temp.data);
        // temp = temp.next;
        // }

        // Node temp = recursionReverse(head);
        // while (temp != null) {
        // System.out.println(temp.data);
        // temp = temp.next;
        // }

        boolean ans = checkPalindrome(head);
        System.out.println(ans);

    }

    public static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = mover.next; // temp;
        }
        return head;
    }

    public static int lengthOfLL(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            // System.out.print(temp.data + " ");
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static boolean searchInLL(Node head, int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static Node deleteHead(Node head) {
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;
    }

    public static Node deleteTail(Node head) {
        // if you have empty LL or only one ele that it's give you null
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null; // last becomes null here
        return head;

    }

    public static Node deletePositionNode(Node head, int position) {
        if (head == null) { // position == 0
            return head;
        }
        if (position == 1) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == position) {
                prev.next = prev.next.next;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static Node insertedHead(Node head, int val) {
        Node temp = new Node(val, head);
        return temp;
    }

    public static Node insertedTail(Node head, int val) {
        if (head == null) {
            head = new Node(val);
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    public static Node insertedKthPosition(Node head, int val, int ind) {
        if (head == null) {
            if (ind == 1) {
                return new Node(val);
            }
        }
        if (ind == 1) {
            return new Node(val, head);
        }
        Node temp = head;
        Node prev = null;
        int count = 0;
        while (temp.next != null) {
            count++;
            if (count == ind) {
                prev.next = new Node(val);
                prev.next.next = temp;
            }
            prev = temp;
            temp = temp.next;
        }
        temp.next = new Node(val);
        return head;

    }

    public static Node insertedKthPosition2(Node head, int val, int ind) {
        if (head == null) {
            if (ind == 1) {
                return new Node(val);
            } else {
                return head;
            }
        }
        if (ind == 1) {
            return new Node(val, head);
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == (ind - 1)) {
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;

            }
            temp = temp.next;
        }

        return head;

    }

    // insert after the kth position element

    public static Node insertAfterKthNode(Node head, int val, int ind) {
        if (head == null) {
            if (ind == 1) {
                return new Node(val);
            } else {
                return null;
            }
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == ind) {
                Node newNode = new Node(val, temp.next);
                temp.next = newNode;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void printReverse(Node head) {
        if (head == null) {
            return;
        }

        printReverse(head.next);
        System.out.println(head.data);
    }

    public static Node reverseLL(Node head) {
        Node temp = null;
        while (head != null) {
            Node newNode = new Node(head.data);
            newNode.next = temp;
            temp = newNode;
            head = head.next;
        }
        return temp;
    }

    public static Node oddEvenList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node otemp = head;
        Node etemp = head.next;
        Node ehead = etemp;

        while (etemp != null && etemp.next != null) {
            otemp.next = otemp.next.next;
            otemp = otemp.next;

            etemp.next = etemp.next.next;
            etemp = etemp.next;

        }
        otemp.next = ehead;
        return head;
    }

    public static Node sortedLL012(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node zeroD = new Node(0);
        Node oneD = new Node(0);
        Node twoD = new Node(0);

        Node zero = zeroD;
        Node one = oneD;
        Node two = twoD;

        Node temp = head;

        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            } else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }
        zero.next = oneD.next;
        one.next = twoD.next;
        two.next = null;

        return zeroD.next;

    }

    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node prev = null;
        Node temp = head;
        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static Node recursionReverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = recursionReverse(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }

    public static boolean checkPalindrome(Node head) {
        if (head == null) {
            return true;
        }

        Node fast = head;
        Node slow = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newNode = recursionReverse(slow.next);
        Node first = head;
        Node second = newNode;

        while (second != null) {
            if (first.data != second.data) {
                // recursionReverse(newNode);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        recursionReverse(newNode);
        return true;

    }

}
