 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode result = new ListNode();

        int total = 0;
        ListNode current = head;
        while(true) {
            total ++;
            current = current.next;
            if (current == null) {
                break;
            }
        }
        int count = 0;
        ListNode last = head;
        current = head;
        while(true) {
            count ++;
            if (count == total - n + 1) {
                // 当前节点为待删除节点
                if (count == 1) {
                    // 待删除的为表头
                    result = current.next;
                } else {
                    last.next = current.next;
                    result = head;
                }
                break;
            } else {
                if (count > 1) {
                    last = last.next;
                }
                current = current.next;
            }
        }
        return result;
    }
}

