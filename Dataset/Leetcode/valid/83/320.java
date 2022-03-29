class Solution {
    public ListNode XXX(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null) {
            while(fast != null && slow.val == fast.val) {
                fast = fast.next;
            }
            slow.next = fast;
            slow = slow.next;
        }
        return head;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


