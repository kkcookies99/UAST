class Solution {
    public ListNode XXX(ListNode head) {
        var current = head;
        while(current != null){
            while(current.next != null && current.val == current.next.val){
                current.next = current.next.next;
            }
            current = current.next;
        }

        return head;
    }
}

