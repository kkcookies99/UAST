class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null) return null;
        ListNode dummy = head;
        while(dummy.next != null) {
            if(dummy.val == dummy.next.val) {
                dummy.next = dummy.next.next;
            } else {
                dummy = dummy.next;
            }
            
        }
        return head;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


