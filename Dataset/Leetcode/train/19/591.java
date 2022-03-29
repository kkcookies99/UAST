 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;
        ListNode third = head;//记录第二个指针的前置节点
        int i = 0;
        while(first.next!=null){
            i++;
            first = first.next;
            if(i>=n) second = second.next;
            if(i>=n+1) third = third.next;
        }
        if(i+1 == n){
            head = head.next;
        }
        if(i==2){
            if(n==1) head.next.next=null;
            if(n==2) head.next = head.next.next;
        }else if(i==1){
            if(n==1) head.next = null;
        }else if(i==0){
            head = null;
        }else{
            third.next = second.next;
        }
        return head;
    }
}

