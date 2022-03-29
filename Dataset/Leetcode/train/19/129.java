 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode l1 = preHead;
        ListNode l2 = preHead;
        while(n > 0){
            l1 = l1.next;
            n--;
        }
        while(l1.next != null){
            l1 = l1.next;
            l2 = l2.next;
        }
        //l2的下一个结点就是倒数第n个
        l2.next = l2.next.next;
        return preHead.next;
    }
}

