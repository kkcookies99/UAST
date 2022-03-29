class Solution {
    public ListNode XXX(ListNode head) {
        // 既然是升序，那就以一个节点为主
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = head;
        ListNode node = head.next;
        while(node != null) {
            while (node != null && node.val == cur.val) {
                node = node.next;
            } 
            if (node != null) {
                // 拼接在cur的后面
                ListNode tmp = node.next;

                cur.next = node;
                cur = node;
                node.next = null;

                node = tmp;
            }
        }
        cur.next = null;
        return head;
    }
}

