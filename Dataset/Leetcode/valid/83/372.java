class Solution {
        public ListNode XXX(ListNode head) {
            ListNode pre = null;
            ListNode cur = head;
            while (cur != null) {
                ListNode next = cur.next;
                if (pre != null && pre.val == cur.val) {
                    pre.next = next;
                    cur = next;
                } else {
                    pre = cur;
                    cur = next;
                }
            }
            return head;
        }
    }

