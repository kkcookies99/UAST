class Solution {
   public ListNode XXX(ListNode head) {
        ListNode ans = head;
        if (head == null || head.next == null)return ans;
        while (head.next != null){
            if (head.val == head.next.val){
                head.next = head.next.next;
                continue;
            }
            head = head.next;
        }
        return ans;
    }
}

