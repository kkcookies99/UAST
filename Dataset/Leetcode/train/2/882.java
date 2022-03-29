 class Solution {
    public void test(int jinwei, ListNode p){
        while(p.next!=null){
            int val=p.val+jinwei;
            if(val>=0 && val<=9){
                p.val=val;
                jinwei=0;
                return;
            }else{
                jinwei=val/10;
                int yushu=val%10;
                p.val=yushu;
            }
            p=p.next;
        }
        int val=p.val+jinwei;
        if(val>=0 && val<=9){
            p.val=val;
            return;
        }else{
            p.val=val%10;
            ListNode node=new ListNode(val/10);
            p.next=node;
        }
        return;
    }
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode p1=l1;
        ListNode p2=l2;
        int jinwei=0;
        while(p1.next!=null && p2.next!=null){
            int val=p1.val+p2.val+jinwei;
            if(val>=0 && val<=9){
                p1.val=val;
                p2.val=val;
                jinwei=0;
            }else{
                jinwei=val/10;
                int yushu=val%10;
                p1.val=yushu;
                p2.val=yushu;
            }
            p1=p1.next;
            p2=p2.next;
        }
        if(p1.next==null && p2.next==null){
            test(jinwei+p1.val,p2);
            return l2;
        }
        if(p2.next==null){
            test(jinwei+p2.val, p1);
            return l1;
        }
        if(p1.next==null){
            test(jinwei+p1.val, p2);
            return l2;
        }
        return l2;
    }
}


