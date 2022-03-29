 class Solution {
    public ListNode XXX(ListNode head, int n) {
        // 利用快慢指针找到倒数第n个结点slow，及上一个结点prev
        // prev为null时, 说明删的是头结点返回head.next; 不为null,令prev.next=slow.next, slow.next=null,返回head
        // 快指针先走n步，然后快慢指针一起走，fast=null，slow所指即倒数第n个结点
        ListNode prev = null, fast = head, slow = head;
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        while (fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        if (prev == null) {
            return head.next;
        } else {
            prev.next = slow.next;
            slow.next = null;
            return head;
        }    
    }
}

