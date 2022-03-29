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
        return test(l1,l2,0);
    }

    public ListNode test(ListNode l1, ListNode l2,int go){
        ListNode listNode = new ListNode();
        if (null != l1 && null != l2) {
            int i = l1.val + l2.val + go;
            if (i >= 10) {
                //进位
                listNode.val = i - 10;
                listNode.next = test(l1.next,l2.next,1);
            } else {
                //小于十
                listNode.val = i;
                listNode.next = test(l1.next,l2.next,0);
            }
        }else if (null!=l1 && null==l2){
            int i = l1.val + go;
            if (i>=10){
                listNode.val=i-10;
                listNode.next=test(l1.next,null,1);
            }else {
                listNode.val=i;
                listNode.next=test(l1.next,null,0);
            }
        }else  if (null!=l2 && null==l1){
            int i = l2.val + go;
            if (i>=10){
                listNode.val=i-10;
                listNode.next=test(null,l2.next,1);
            }else {
                listNode.val=i;
                listNode.next=test(null,l2.next,0);
            }
        }else if(null==l1 &&null==l2 &&go==1){
            return new ListNode(1);
        }
        if(null==l1 &&null==l2 &&go==0){
            return null;
        }
        return listNode;
    }
}

