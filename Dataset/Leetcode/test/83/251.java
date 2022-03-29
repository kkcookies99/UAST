class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        if (head.val != head.next.val) {
            head.next = XXX(head.next);
            return head;
        } else {
            while ((head = head.next).next != null && (head.val == head.next.val)) {
            }
            return XXX(head);
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


