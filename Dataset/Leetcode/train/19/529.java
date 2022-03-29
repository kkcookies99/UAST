 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode node1 = new ListNode(0,head),node2 = node1;
        for (int i = 0; i < n; i++) head = head.next;
        while (head != null){
            head = head.next;
            node1 = node1.next;
        }
        node1.next = node1.next == null ? null:node1.next.next;
        return node2.next;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


