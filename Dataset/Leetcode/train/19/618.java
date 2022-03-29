 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode node1 = head;
        ListNode node2 = head;
        int len = 0;
        while (len < n && node2.next != null){
            node2 = node2.next;
            len++;
        }
        if(len != n) return head.next;
        while (node2.next != null){
            node2 = node2.next;
            node1 = node1.next;
        }
        node1.next = node1.next.next;

        return  head;
    }
}

