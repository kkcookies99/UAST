 class Solution {
    public ListNode XXX(ListNode head, int n) {
        int index = 1;
        Map<Integer, ListNode> map = new HashMap<>();
        map.put(index++, head);
        ListNode next = head.next;
        while (next != null) {
            map.put(index++, next);
            next = next.next;
        }
        
        // 倒数n+1
        ListNode pre = map.get(index-n-1);
        // 倒数n
        ListNode cur = map.get(index-n);
        
        if (pre == null) {
            return cur.next;
        } else {
            pre.next = cur.next;
            return map.get(1);
        }
    }
}

