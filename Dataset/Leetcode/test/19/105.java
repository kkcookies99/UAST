 class Solution {
    public ListNode XXX(ListNode head, int n) {
        int step = 0;
        ListNode res = head;
        ListNode slownode = res;
        while (step < n){
            head = head.next;
            step++;
        }
        while (head.next != null){
            head = head.next;
            slownode = slownode.next;
        }
        slownode.next = slownode.next.next;
        return res;
    }
}

