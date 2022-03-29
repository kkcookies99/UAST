 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode pre = head;
        ListNode pro = head;
        for(int i = 1 ; i<= n ; i ++){
            pro = pro.next;
            if(pro == null) {return head.next;} 
        }
        while(pro.next != null){
            pre = pre.next;
            pro = pro.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}

