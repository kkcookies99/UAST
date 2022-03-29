 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }
        ListNode l3 = new ListNode((l1.val + l2.val) % 10);
        if(l1.val + l2.val >= 10){
            l3.next = XXX(XXX(l1.next, l2.next), new ListNode(1));
        }else{
            l3.next = XXX(l1.next, l2.next);
        }
        return l3;
    }
}

