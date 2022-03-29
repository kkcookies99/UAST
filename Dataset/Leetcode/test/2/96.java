class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        return add(l1,l2,0);
    }
    public ListNode add(ListNode l1, ListNode l2, int a){
        if(l1 == null && l2 == null && a == 0) return null;
        int x = l1==null ? 0 : l1.val;
        int y = l2==null ? 0 : l2.val;
        int sum = x + y + a;
        ListNode n = new ListNode(sum % 10);
        n.next = add(l1==null ? null : l1.next,
                     l2==null ? null : l2.next,
                     sum/10);
        return n;
    }
}

