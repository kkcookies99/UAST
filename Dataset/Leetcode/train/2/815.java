 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode newNext = null;
        ListNode ll1 = l1;
        ListNode ll2 = l2;
        int jin = 0;
        
        if(head == null){
            int sum = ll1.val+ll2.val;
            if(sum<10){
                head = new ListNode(sum);
                newNext = head;
            }else{
                int cha = sum - 10;
                head = new ListNode(cha);
                newNext = head;
                jin = 1;
            }
            ll1 = ll1.next;
            ll2 = ll2.next;
        }
        while(ll1!=null&&ll2!=null){
            int sum = ll1.val+ll2.val+jin;
            if(sum<10){
                newNext.next = new ListNode(sum);
                newNext = newNext.next;
                jin = 0;
            }else{
                int cha = sum - 10;
                newNext.next = new ListNode(cha);
                newNext = newNext.next;
                jin = 1;
            }
            ll1 = ll1.next;
            ll2 = ll2.next;
        }
        while(ll1 == null&&ll2!=null){
                int sum = ll2.val+jin;
                if(sum<10){
                    newNext.next = new ListNode(sum);
                    ll2 = ll2.next;
                    newNext = newNext.next;
                    jin = 0;
                }else{
                    newNext.next = new ListNode(0);
                    ll2 = ll2.next;
                    newNext = newNext.next;
                    jin = 1;
                }
                        
            }
        while(ll1 != null&&ll2==null){
            int sum = ll1.val+jin;
            if(sum<10){
                newNext.next = new ListNode(sum);
                ll1 = ll1.next;
                newNext = newNext.next;
                jin = 0;
            }else{
                newNext.next = new ListNode(0);
                ll1 = ll1.next;
                newNext = newNext.next;
                jin = 1;
            }
        }
        if(ll1==null&&ll2==null&&jin==1){
            newNext.next = new ListNode(1); 
        }
        return head;
    }
}

