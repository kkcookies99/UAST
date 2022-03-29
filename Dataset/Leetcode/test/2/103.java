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
 import  java.math.BigDecimal;
class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        StringBuilder sb1=new StringBuilder ();
        StringBuilder sb2=new StringBuilder ();
        while(l1!=null){sb1.append(l1.val);l1=l1.next;}
        while(l2!=null){sb2.append(l2.val);l2=l2.next;}
        BigDecimal num=new BigDecimal(sb1.reverse().toString());
       num= num.add(new BigDecimal(sb2.reverse().toString()));
        String st=num.toString();
        ListNode first=new ListNode();
        if(st.length()==0)return first;
        first.val=Integer.valueOf(st.charAt(0)-'0');
        for(int i=1;i<st.length();i++){
            ListNode next=new ListNode(Integer.valueOf(st.charAt(i)-'0'));
            next.next=first;
            first=next;
        }
        return first;
    }
}

