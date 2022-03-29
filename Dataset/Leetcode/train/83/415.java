 class Solution {
    public ListNode XXX(ListNode head) {
        if(head==null)return head;
        ListNode curr=head,Sentry=head.next;
        while(Sentry!=null){
            if(curr.val==Sentry.val){
                while(Sentry!=null && curr.val==Sentry.val)Sentry=Sentry.next;
                curr.next=Sentry;
                if(Sentry!=null){
                    Sentry=Sentry.next;
                }
            }else{
                curr=curr.next;
            }

        }
        return head;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


