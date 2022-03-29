 class Solution {
    public ListNode XXX(ListNode head, int n) {
        
        ListNode l = head;
        int len = 0;
        while(l != null){
            len ++;
            l = l.next;
        }
        
        int cur = len - n;
        if(len<n) return null;
        ListNode nn = new ListNode(0);
        nn.next = head;
        ListNode nnn = nn;
        while(cur>0){
            nnn = nnn.next;
            cur --;
        }
        if(nnn.next!=null){
            nnn.next = nnn.next.next;
        }else return null;
        
        return nn.next;
    }
}

