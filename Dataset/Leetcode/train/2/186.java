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
        ListNode h = new ListNode(0);
        ListNode s = h;
        ListNode p = l1;
        ListNode q = l2;
        int temp = 0;
        while(p!=null || q!=null){
            ListNode r = new ListNode(0);
            s.next = r;
            s = r;
            int x = p!=null?p.val:0;
            int y = q!=null?q.val:0;
            s.val = x+y+temp>=10?(x+y+temp)%10:x+y+temp;
            temp = (x+y+temp)/10;
            p = p!=null?p.next:null;
            q = q!=null?q.next:null;            
            
        }
        
        if(temp!=0){
            ListNode r = new ListNode(0);
            s.next = r;
            s = r;
            s.val = temp;
        }
        
        return h.next;
        
    }
}

