 class Solution {
    public ListNode XXX(ListNode head, int n) {
        //哑结点
        ListNode dummy = new ListNode(0,head);
        ListNode fast = dummy;
        ListNode slow = head;
        for(int i = 0;i<n;i++){
            fast = fast.next;
        }
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast =fast.next;
        }
        //此时slow.next是倒数的节点，删除
        slow.next = slow.next.next;
        return dummy.next;
    }
}

