 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode saveHeader = head;
        int index = 1;
        while (head != null && index < n) {
            head = head.next;
            ++index;
        }

        if (head == null) return saveHeader;

        ListNode prePrev = null;
        ListNode prev = saveHeader;

        while (head != null) {
            head = head.next;
            if (head == null) 
                break;
            prePrev = prev;
            prev = prev.next;
        }

        if (prePrev == null) {
            ListNode temp = saveHeader.next;
            saveHeader.next = null;
            saveHeader = temp;
        }
        else {
            ListNode temp = prev.next;
            prev.next = null;
            prePrev.next = temp;
        }
        
        return saveHeader;
    }
}

