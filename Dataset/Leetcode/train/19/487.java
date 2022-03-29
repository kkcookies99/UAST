 class Solution {
    public ListNode XXX(ListNode head, int n) {
        //添加头节点
        ListNode tmpHead = new ListNode();
        tmpHead.next = head;
        ListNode fast = tmpHead;
        ListNode slow = tmpHead;
        int i=0;
        while(i<n){
            fast = fast.next;
            i++;
        }
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next = slow.next.next;
        return tmpHead.next;
    }
}

