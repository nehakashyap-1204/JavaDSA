package code.program.LLproblems;
public class LL {
    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

//     (1) INSERTION USING RECURSION:-
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }
// (2) REMOVE DUPLICATES:-
    public void Duplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

   public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
   }

// (3) MERGE TWO SORTED LIST:-

    public static LL merge (LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();
        while (f != null && s != null) {
            if (f.val < s.val) {
                ans.insertLast(f.val);
                f = f.next;
            } else {
                ans.insertLast(s.val);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLast(f.val);
            f = f.next;
        }

        while (s != null) {
            ans.insertLast(s.val);
            s = s.next;
        }

        return ans;
    }
// (4) Linked List Cycle:
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public int LengthofCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
               // calculate the length:
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    public ListNode detectCycle (ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = LengthofCycle(slow);
                break;
            }
        }
        // find start node
        ListNode f = head;
        ListNode s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }
        // keep moving both forward and they will meet at cycle start
        while (f != s){
            f = f.next;
            s = s.next;
        }
        return s;
    }


// (5) HAPPY NUMBER:
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1){
            return true;
        }
        return false;
    }
    private int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans = ans + rem * rem;
            number = number / 10;
        }
        return ans;
    }
//(6) MIDDLE NODE:
    public ListNode middleNode (ListNode head) {
        ListNode f = head;
        ListNode s = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
// (7) MergeSort:
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left,right);
    }

    ListNode merge (ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }











   public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        return;

   }

   public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
       System.out.println("END");
   }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public class ListNode {
        private ListNode head;
        private ListNode tail;

        private ListNode  next;
        int val;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(ListNode head, ListNode  tail, ListNode  next) {
            this.head = head;
            this.tail = tail;
            this.next = next;
        }
    }
}
