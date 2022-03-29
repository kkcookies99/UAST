 class Solution {
   public ListNode XXX(ListNode head, int n) {
        if(head.next == null ) return null;
        ListNode headBk = head;
        int size = 1;
        while(headBk.next != null){
            headBk = headBk.next;
            size ++;
        }
        headBk = head;
        for(int i = 0; i < size - n - 1; i++){
            headBk = headBk.next;
        }
        if (size == n){
            head = head.next;
        }
        else{
            headBk.next = headBk.next.next;
        }
        return head;
    }
}

