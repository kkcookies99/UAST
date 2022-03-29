 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode p=head;
        ListNode q=head;
        for(int i=0;i<n;++i){
            q=q.next;
        }
        if(q==null)return head.next;
        while(q.next!=null){
            p=p.next;
            q=q.next;
        }
        p.next=p.next.next;
        return head;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


