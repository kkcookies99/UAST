 class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode dummyNode = new ListNode(-98764423);
        dummyNode.next = head;
        ListNode pre = dummyNode;
        ListNode curr = head;
        while (curr != null){
            if (pre.val != curr.val){
                pre.next = curr;
                pre = pre.next;
            }
            curr = curr.next;
        }
        pre.next = null;
        return dummyNode.next;
    }
}

