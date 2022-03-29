class Solution {
    public ListNode XXX(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode pre=head; 
        ListNode nxt=head.next;
        while(nxt!=null){
            if(nxt.val==pre.val){
                pre.next=nxt.next;
                nxt=nxt.next;
            }else{
                pre=nxt;
                nxt=nxt.next;
            }
        }
        return head;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


