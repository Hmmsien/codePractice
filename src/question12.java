// Merge two sorted lists into one large sorted list.

public class question12 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prehead = new ListNode(-1);
        ListNode cur = prehead;

        while (list1 != null && list2 != null) {
            if (list1.value <= list2.value) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }

        cur.next = list1 == null ? list2 : list1;
        return prehead.next;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(6);

        ListNode list2= new ListNode(2);
        list2.next = new ListNode(5);

        printList(mergeTwoLists(list1,list2));
    }
}
