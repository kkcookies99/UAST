 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode fast = new ListNode(0, head);
        ListNode slow = new ListNode(0, head);
        ListNode phead = slow;
        int temp = n;

        while(fast != null && fast.next != null){
            fast = fast.next;
            if(temp > 0){
                temp--;
                continue;
            }
            slow = slow.next;   
        }
        slow.next = slow.next.next;
        return phead.next;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

