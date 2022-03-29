 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode quick = head,slow = head;
        for(int i=0;i<n;i++) quick = quick.next;
        if(quick==null) return head.next;
        while(quick.next!=null){
            quick = quick.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

