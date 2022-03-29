/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode result = new ListNode((l1.val + l2.val) % 10);
        int t = (l1.val + l2.val) / 10;
        ListNode nextResult = result;
        
        while(l1.next != null) {
            if (l2.next != null) {
                int v = l1.next.val + l2.next.val + t;
                nextResult.next = new ListNode(v % 10);
                
                t = v / 10;
                l1 = l1.next;
                l2 = l2.next;
                nextResult = nextResult.next;
            } else {
                int v = l1.next.val + t;
                nextResult.next = new ListNode(v % 10);
                
                t = v / 10;
                l1 = l1.next;
                nextResult = nextResult.next;
            }
        }
        while(l2.next != null) {
            int v = l2.next.val + t;
            nextResult.next = new ListNode(v % 10);

            t = v / 10;
            l2 = l2.next;
            nextResult = nextResult.next;
        }
        if (t != 0) {
            nextResult.next = new ListNode(1);
        }
        return result;
    }
}

