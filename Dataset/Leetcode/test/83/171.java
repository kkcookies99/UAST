class Solution {
    public ListNode XXX(ListNode head) {
        ListNode temp = head;
        while (temp != null){
            if (temp.next == null){
                break;
            }
            if (temp.next.val == temp.val){
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }

        }
        return head;
    }
}

