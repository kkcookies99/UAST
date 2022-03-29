 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode node = new ListNode(0, head);
        ListNode fast = node, slow = node, pre = node;
        while(n > 0) {
            fast = fast.next;
            n--;
        }
        while(fast != null) {
            fast = fast.next;
            pre = slow;
            slow = slow.next;
        }
        pre.next = pre.next.next;
        return node.next;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

