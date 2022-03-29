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
        ListNode ls = new ListNode(0); ListNode lsnext = ls;
        int plus = 0;
        while(null!=l1 && null!=l2){
            int va = l1.val+l2.val+plus;
            plus = va >=10 ? 1:0; 
            lsnext =lsnext.next = new ListNode(va%10);
            //  lsnext.next;
            if(null==l1.next && null==l2.next && plus == 0) break;
            l1 = null!=l1.next ? l1.next:new ListNode(0);
            l2 = null!=l2.next ? l2.next:new ListNode(0);  
        }
        return ls.next;
    }
}

