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
        if (l1==null){
            l1=new ListNode(0);
        }
        if (l2==null){
            l2=new ListNode(0);
        }
        if (l1.val+l2.val>=10){
            ListNode node=new ListNode(l1.val+l2.val-10);
            if (l1.next!=null){
                l1.next.val+=1;
            }else if (l2.next!=null){
                l2.next.val+=1;
            }else{
                node.next=new ListNode(1);
                return node;
            }
           node.next=XXX(l1.next,l2.next);
           return node;
        }
            ListNode node=new ListNode(l1.val+l2.val);
            if (l1.next==null&&l2.next==null){
                return node;
            }
            node.next=XXX(l1.next,l2.next);
            return node;
        
    }
}

