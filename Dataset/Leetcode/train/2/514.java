 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
         ListNode resdummyhead = new ListNode(-1);
         ListNode curresnode = resdummyhead;
        int digit = 0;

        while(l1 != null || l2 != null || digit != 0 ){
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;

            int sum = val1 + val2 + digit;
            int nextnodeval = sum % 10;
            digit = sum / 10;

            curresnode.next = new ListNode(nextnodeval);
            curresnode = curresnode.next;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return resdummyhead.next;
    }
}
昨天刚在某客上做了这道题

