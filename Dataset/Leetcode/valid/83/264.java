class Solution {
    public ListNode XXX(ListNode head) {
        ListNode temp = head;

        if(temp == null) {
            return null;
        }

        while(temp!=null) {
            if(temp.next == null)
                break;
            if(temp.next.val == temp.val) {
                temp.next = temp.next.next;
                continue;
            }

            temp =temp.next;
        }

     return head;   
    }
}

