class Solution {
    public ListNode XXX(ListNode head) {
        if(head == null) return null;
        HashSet<Integer> set = new HashSet<>();
        ListNode pre = head;
        ListNode cur = head.next;
        set.add(head.val);
        while(cur != null){
            if(!set.contains(cur.val)){
                set.add(cur.val);
                pre = cur;
            }
            else
                pre.next = cur.next;
            cur = cur.next;
        }
        return head;
    }
}

