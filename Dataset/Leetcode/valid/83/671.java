 class Solution {
    public ListNode XXX(ListNode head) {
        Integer pre=null;
        Integer cur=null;
        ListNode preNode=null;
        ListNode curNode=head;
        while(curNode!=null){
            cur=curNode.val;
            if(cur==pre){
               preNode.next=curNode.next;
               curNode=curNode.next;
            }else{
               pre=cur;
               preNode=curNode;
               curNode=curNode.next; 
            }
        }
        return head;
    }
}

