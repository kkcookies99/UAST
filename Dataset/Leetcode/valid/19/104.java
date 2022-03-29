 class Solution {
    public ListNode XXX(ListNode head, int n) {
        int count = 0;
        ListNode ans = new ListNode();
        ans.next = head;
        ListNode cur = ans;
        ListNode slow = ans;
        while (cur.next != null){
            if (count >= n){
                slow = slow.next;
            }
            count ++;
            cur = cur.next;
        }
        if (count == 0){
            return null;
        }
        slow.next = slow.next.next;
        return ans.next;
    }
}