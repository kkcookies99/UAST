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
        ListNode l3 = new ListNode(0);
        ListNode p = l3;

        int temp = 0; //进位
        while((l1 != null) || (l2 != null)){
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;
            p.next = new ListNode((v1 + v2 + temp) % 10); //新链表的下一个节点
            temp = (l1.val + l2.val + temp) / 10;
            p = p.next; //链表指针后移
            l1 = (l1 !=null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        if(temp != 0){
            p.next = new ListNode(temp);
        }

        return l3.next;
    }
}

