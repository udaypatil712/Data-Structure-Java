package LinkedList_Java;

import java.util.*;

public class SingleyLinkedList {
    public static void main(String[] args) {
        int[] arr = { 0, 3, 1, 0, 4, 5, 2, 0 };

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

        // boolean ans = checkPalindrome(head);
        // System.out.println(ans);

        // Node temp = add1InLL(head, 10);
        // while (temp != null) {
        // System.out.println(temp.data);
        // temp = temp.next;
        // }

        // Node temp = add1InLLRec(head);
        // while (temp != null) {
        // System.out.println(temp.data);
        // temp = temp.next;
        // }

        // Node temp = middleElementOfLL(head);
        // while (temp != null) {
        // System.out.println(temp.data);
        // temp = temp.next;
        // }

        // Node temp = deleteMiddleNode(head);
        // while (temp != null) {
        // System.out.println(temp.data);
        // temp = temp.next;
        // }

        // Node temp = removeNodes(head);
        // while (temp != null) {
        // System.out.println(temp.data);
        // temp = temp.next;
        // }

        // Node temp = reveresePositionNodes(head, 3, 5);
        // while (temp != null) {
        // System.out.println(temp.data);
        // temp = temp.next;
        // }

        // Node temp = removeLLElements(head, 6);
        // while (temp != null) {
        // System.out.println(temp.data);
        // temp = temp.next;
        // }

        Node temp = mergeSumBetweenZero(head);
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

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

    public static Node add1InLL(Node head, int val) {
        if (head == null) {
            return head;
        }
        Node reverse = reverseLL(head);
        Node temp = reverse;

        int carry = val;

        while (temp != null) {
            int sum = temp.data + carry;
            temp.data = sum % 10;
            carry = sum / 10;

            if (carry == 0) {
                break;
            }
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        if (carry > 0) {
            temp.next = new Node(carry);
        }
        head = reverseLL(reverse);
        return head;

    }

    public static Node add1InLLRec(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        int carry = 1;
        Node newNode = add1InLLRec(head.next);
        int sum = newNode.data + carry;
        if (sum > 9) {
            newNode.data = sum % 10;
            carry = sum / 10;
        } else {
            newNode.data = sum % 10;
            carry = 0;
        }

        return newNode;

    }

    public static Node middleElementOfLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.next;
    }

    public static Node deleteMiddleNode(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head.next;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;

        return head;

    }

    public static Node removeNodes(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head;
        Stack<Node> st = new Stack<>();
        while (temp != null) {
            while (!st.empty() && st.peek().data <= temp.data) {
                st.pop();
            }
            st.push(temp);
            temp = temp.next;
        }
        Node newHead = null;

        while (!st.isEmpty()) {
            Node node = st.pop();
            node.next = newHead;
            newHead = node;
        }

        return newHead;
    }

    public static Node reveresePositionNodes(Node head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        Node temp = head;

        for (int i = 1; i < left - 1; i++) {
            temp = temp.next;
        }
        Node prevLeft = temp;

        Node dummy = new Node(0);
        Node dt = dummy;

        for (int i = left; i <= right; i++) {
            dt.next = new Node(temp.next.data);
            dt = dt.next;
            temp = temp.next;
        }
        Node rightnext = temp.next;

        Node revLL = reverseLL(dummy.next);
        Node trev = revLL;
        prevLeft.next = revLL;
        while (trev.next != null) {
            trev = trev.next;
        }
        trev.next = rightnext;

        return head;
    }

    public static Node removeLLElements(Node head, int val) {

        Node dummy = new Node(0, head);
        Node curr = dummy;

        while (curr.next != null) {
            if (curr.next.data == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;

    }

    public static Node mergeSumBetweenZero(Node head) {

        Node dummy = new Node(0);
        Node tail = dummy; // final list tail

        Node curr = head;

        while (curr != null) {

            int sum = 0;

            // skip the zero at the start
            curr = curr.next;

            // sum until next zero
            while (curr != null && curr.data != 0) {
                sum += curr.data;
                curr = curr.next;
            }

            if (sum != 0) {
                tail.next = new Node(sum);
                tail = tail.next;
            }
        }

        return dummy.next;
    }

}
