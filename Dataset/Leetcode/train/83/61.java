class Solution {
    public ListNode XXX(ListNode head) {
        Set<Integer> set = new HashSet<>();
        ListNode d = new ListNode(0);
        ListNode pre = d;
        while(head != null){
            int val = head.val;
            if(set.add(val)){
                pre.next = new ListNode(val);
                pre = pre.next;
            }
            head = head.next;
        }
        return d.next;
    }
}

