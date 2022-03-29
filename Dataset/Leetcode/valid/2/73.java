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
       StringBuffer l1s = new StringBuffer();
       for(int i = 0;i<100;i++){
            if(l1.next == null){
                break;
            }
         
            l1s.append(l1.val);
            l1 = l1.next;
       }
       StringBuffer l2s = new StringBuffer();
       for(int i = 0;i<100;i++){
            if(l2.next == null){
                break;
            }
         
            l2s.append(l2.val);
            l2 = l2.next;
       }

       Integer l1i = Integer.valueOf(l1s.reverse().toString());
       Integer l2i = Integer.valueOf(l2s.reverse().toString());
    Integer l3i = l1i+l2i;
    StringBuffer sb = new StringBuffer(l3i.toString());
    sb.reverse();
    char[] chars = sb.toString().toCharArray();
    ListNode res = new ListNode(chars[0]);
    ListNode other = res;

    for(int i = 1;i<chars.length;i++){
        ListNode ln = new ListNode(chars[i]);
        other.next = ln;
        other = ln;
    }
        
    return other;
            
    }
}

