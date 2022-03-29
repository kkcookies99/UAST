 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if(head.next.next == null){
            return null;
        }
        ListNode man = head,kuai = head;
        for(int i =0;i<n;i++){
            kuai = kuai.next;
        }
        while(kuai!=null && kuai.next != null){
            kuai = kuai.next;
            man = man.next;
        }
        man.next = man.next.next;
        return head;

    }
}

