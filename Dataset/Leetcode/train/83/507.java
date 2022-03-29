 class Solution {
    public ListNode XXX(ListNode head) {
        ListNode res=new ListNode(0);
        res.next=head;
        while(head!=null&&head.next!=null){
            while(head.next!=null&&head.val==head.next.val){
                head.next=head.next.next;
            }
            if(head.next!=null){
                head=head.next;
            }
        }
        return res.next;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


