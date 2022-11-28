import java.util.Arrays;
import java.util.List;

// Reverse a singly-linked list iteratively.
class ListNode {
    public int value;
    public ListNode next;
    public ListNode(int value) {
        this.value = value;
        next = null;
    }
}

public class question11 {
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

     static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        printList(reverseList(list1));

        System.out.println("\n---------");

        ListNode list2= new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(3);
        printList(reverseList(list2));
    }
}
