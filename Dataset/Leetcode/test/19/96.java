 class Solution {
   
    public ListNode XXX(ListNode head, int n) {
        int size = getSize(head);
        if(size == 0) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pred = dummy;
        for(int i = 0; i < size - n  ; i++) {
            pred = pred.next;
        }
        pred.next = pred.next.next;
        return dummy.next;
    }

    private int getSize(ListNode head) {
        if(head == null)
            return 0;
        int size = 0;
        while(head != null) {
            size++;
            head = head.next;
        }
        return size;
    }
}

