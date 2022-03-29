/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cursor = dummy;
        int carry = 0;
        // not l1.next != null and cursor != 0 for case like [9,9,9,9,9,9,9] [9,9,9,9]
        while( l1 != null || l2 != null || carry != 0){
            int l1Val = l1 == null ? 0 : l1.val;
            int l2val = l2 == null ? 0 : l2.val;
            int sum = l1Val + l2val + carry;
            carry = sum/10;
            //sum %= sum;
            // use a temp node here or not are both fine
            cursor.next = new ListNode(sum%10);
            cursor = cursor.next;
            
            if( l1 != null ){
                l1 = l1.next;
            }
            if( l2 != null ){
                l2 = l2.next;
            }
        }
        // dont return dummy here
        return dummy.next;
    }
}

