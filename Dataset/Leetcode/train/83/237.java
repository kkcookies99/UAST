class Solution {
    public ListNode XXX(ListNode head) { 
        ListNode temp = head;
        while (temp != null) {
            if (temp.next == null) return head;
            if (temp.val == temp.next.val) temp.next = temp.next.next;
            else temp = temp.next;
        }
        return head;
    }
}

