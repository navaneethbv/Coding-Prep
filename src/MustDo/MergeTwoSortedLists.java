package MustDo;

import java.util.List;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1 = new ListNode(2);
        node1 = new ListNode(4);
        ListNode node2 = new ListNode(1);
        node2 = new ListNode(3);
        node2 = new ListNode(4);

        System.out.println(node1.val);

        System.out.println("The merged list is "+mergeTwoLists(node1, node2));
    }

    static ListNode mergeTwoLists(ListNode node1, ListNode node2) {
        if(node1 == null) {
            return node2;
        } else if(node2 == null) {
            return node1;
        }
        else if (node1.val < node2.val) {
            node1.next = mergeTwoLists(node1.next, node2);
            return node1;
        } else {
            node2.next = mergeTwoLists(node1, node2.next);
            return node2;
        }
    }

}
