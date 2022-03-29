 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if(head.next==null) return null;
        ListNode list = head,list1 = head;
        if(n==1){
            while(list.next.next!=null){
                list = list.next;
            }
            list.next = null;
        }
        else{
            while(list!=null){
            if(n>0) n--;
            else list1 = list1.next;
            list = list.next;
            }
            list1.val = list1.next.val;
            list1.next = list1.next.next;
        }
        return head;
}
}

