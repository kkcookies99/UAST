 class Solution {
    public ListNode XXX(ListNode head, int n) {
        //双指针
        ListNode slow = head;
        ListNode fast = head;
        while(n-- != 0){
            fast = fast.next;
        }
        if(fast == null){
            return head.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow  = slow.next;
        }
        slow.next = slow.next.next;
        return head;

        //暴力解
        // int len = 0;
        // ListNode p = new ListNode();
        // p.next = head;
        // ListNode tail = head;
        // while(tail != null){
        //     len ++;
        //     tail = tail.next;
        //     System.out.println(len);
        // }
        // ListNode end = p;
        // for (int i= 0; i < len-n; i++) {
        //     end = end.next;
        // }
        // if(end.next != null) {
        //     tail = end.next.next;
        //     end.next = tail;
        // }
        
        // return p.next;
    }

}

