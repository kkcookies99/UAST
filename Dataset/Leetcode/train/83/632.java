 class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null)
            return null;

        ListNode curr = head.next;
        ListNode slow = head;
        while (curr != null) {
            if (slow.val == curr.val) {
                slow.next = curr.next ;
            }else {
                slow = slow.next ;
            }
            curr = curr.next;
        }
        return head;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


