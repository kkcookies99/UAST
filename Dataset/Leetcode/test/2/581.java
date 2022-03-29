 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode res = new ListNode(0);
        ListNode firstNode = res;
        while(l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            carry = val1 + val2 + carry;
            ListNode nextNode = new ListNode(carry % 10);
            res = res.next = nextNode;
            carry = carry >=10 ? 1 : 0;
            l1 = l1 == null ? null:l1.next;
            l2 = l2 == null ? null:l2.next;
        }
        if(carry == 1) {
             ListNode nextNode = new ListNode(1);
             res.next = nextNode;
        }
        
        return firstNode.next;
    }
    
}

