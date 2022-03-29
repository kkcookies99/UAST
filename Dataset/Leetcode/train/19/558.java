 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode old = head;
        ListNode node = head;
        ListNode nodeLeft = null;
        while (head!=null){
            if(--n<0){
                nodeLeft=node;
                node=node.next;
            }
            head=head.next;
        }
        if(nodeLeft==null) old=old.next;
        else {
            nodeLeft.next=node.next;
        }
        return old;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


