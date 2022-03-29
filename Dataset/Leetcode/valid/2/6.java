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
        return this.XXX2(l1,l2,0);
    }
    public ListNode XXX2(ListNode l1, ListNode l2,int a) {
        if(l1==null&&l2==null){return a==0?null:new ListNode(a);}
        if(l1 !=null){a += l1.val;l1 = l1.next;}
        if(l2 !=null){a += l2.val;l2 = l2.next;}
        return new ListNode(a%10,XXX2(l1,l2,a/10));
    }
}

