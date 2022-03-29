 class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode next = head.next;
        ListNode pre = head;
        while (next != null) {
            if (pre.val == next.val  ) {
                pre.next = next = next.next;

            } else {
                pre = next;
                next = next.next;
            }
            
        }
        return head;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


