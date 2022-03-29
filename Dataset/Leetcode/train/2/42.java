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
        int flag = 0;
        ListNode tmp = null;
        while (l1 != null || l2 != null || flag == 1) {
            ListNode l3 = new ListNode();
            if (l1 == null && l2 == null) {
                l3.val = flag;
                flag = 0;
            } else if (l1 == null) {
                if (l2.val + flag >= 10) {
                    l3.val = l2.val + flag - 10;
                    flag = 1;
                } else {
                    l3.val = l2.val + flag;
                    flag = 0;
                }
                l2 = l2.next;
            } else if (l2 == null) {
                if (l1.val + flag >= 10) {
                    l3.val = l1.val + flag - 10;
                    flag = 1;
                } else {
                    l3.val = l1.val + flag;
                    flag = 0;
                }
                l1 = l1.next;
            } else if (l1.val + l2.val + flag >= 10) {
                l3.val += (l1.val + l2.val + flag) - 10;
                flag = 1;
                l1 = l1.next;
                l2 = l2.next;
            } else {
                l3.val = (l1.val + l2.val + flag);
                flag = 0;
                l1 = l1.next;
                l2 = l2.next;
            }

            // 插入l3到链表尾部
            if (tmp == null) {
                tmp = l3;
            } else {
                ListNode node = tmp;
                while (node.next != null) {
                    node = node.next;
                }
                node.next = l3;
            }
        }

        return tmp;
    }
}