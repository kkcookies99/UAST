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
        if(l1 == null)  return l2;
        if(l2 == null)  return l1;
        int carry = 0;
        // 尝试不创建新节点
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        while(l1 != null && l2 != null){
            int val = l1.val + l2.val + carry;
            carry = val / 10;
            l1.val = val % 10;

            pre.next = l1;
            pre = pre.next;

            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int val = l1.val + carry;
            carry = val / 10;
            l1.val = val % 10;

            pre.next = l1;
            pre = pre.next;

            l1 = l1.next;
        }

        while(l2 != null){
            int val = l2.val + carry;
            carry = val / 10;
            l2.val = val % 10;

            pre.next = l2;
            pre = pre.next;

            l2 = l2.next;
        }

        if(carry != 0)  pre.next = new ListNode(carry);

        return dummy.next;
    }
}

