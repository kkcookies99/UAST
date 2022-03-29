 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode i = head;
        ListNode j = head;
        for(int k =0;k<n;k++){
            i = i.next;
        }
        if(i == null){
            return head.next;
        }
        while(i.next!=null){
            i=i.next;
            j=j.next;
        }
        j.next = j.next.next;
        return head;
    }
}

