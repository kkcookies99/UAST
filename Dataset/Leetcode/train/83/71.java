class Solution {
    public ListNode XXX(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode node=head;
        while(node.next!=null){
            if(node.val==node.next.val){
                if(node.next.next!=null){
                    node.next=node.next.next; 
                }else{
                    node.next=null;
                }
            }else{
                node=node.next;
            }
            
        }
        return head;
    }
}

