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
    public ListNode XXX(ListNode leftNode, ListNode rightNode) {
        ListNode res = new ListNode(0);
        ListNode temp = res; 
        int val = 0;
        while (true) {
           if(leftNode != null) {
               val += leftNode.val;
               leftNode = leftNode.next;
           }
           if(rightNode != null) {
               val += rightNode.val;
               rightNode = rightNode.next;
           }
           temp = temp.next = new ListNode(val%10);
           val /= 10;
           if(leftNode == null){
               if(val == 0){
                   temp.next = rightNode;
                   break;
               }
               if(rightNode == null){
                   temp.next = new ListNode(val);
                   break;
               }
           }
           if(rightNode == null && val == 0){
               temp.next = leftNode;
               break;            
           }
        }
        return res.next;
    }
 }

