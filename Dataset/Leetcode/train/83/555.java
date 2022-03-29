 class Solution {
    public ListNode XXX(ListNode head) {
        ListNode intermediateVariables = head;

        while (intermediateVariables != null) {

            while (intermediateVariables.next != null && intermediateVariables.val == intermediateVariables.next.val) {
                intermediateVariables.next = intermediateVariables.next.next;
            }

            intermediateVariables = intermediateVariables.next;
        }

        return head;
    }
}

