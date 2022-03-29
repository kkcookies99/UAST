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
      public ListNode Add(ListNode l1,ListNode l2,ListNode result,int sign){
        int sum = l1.val+l2.val + sign;
        result.val = sum%10;
        if (sum>=10) sign = 1;
        else sign = 0;
        if (l1.next==null&&l2.next==null) {
            if(sign == 1) result.next=new ListNode(1);
            return result;

        }

        if(l1.next!=null&&l2.next!=null){
            result.next = new ListNode();
            Add(l1.next,l2.next,result.next,sign);
        }
        else if(l1.next==null){
            result.next = new ListNode();
            AddSpecial(l2.next,result.next,sign);
        }
        else if(l2.next==null){
            result.next = new ListNode();
            AddSpecial(l1.next,result.next,sign);
        }
        return result;
    }

    public ListNode AddSpecial(ListNode l,ListNode result,int sign){
        int sum = l.val +sign;
        result.val = sum%10;
        if (sum>=10) sign = 1;
        else sign = 0;
        if (l.next!=null){
            result.next = new ListNode();
            AddSpecial(l.next,result.next,sign);
        }
        else if(sign == 1) result.next=new ListNode(1);
        return result;
    }

    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        return Add(l1,l2,result,0);
    }
} 

