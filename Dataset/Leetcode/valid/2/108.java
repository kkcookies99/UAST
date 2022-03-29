class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        return add(l1,l2,0);
    }

    ListNode add(ListNode l1,ListNode l2,int n){

        int valAdd; //相加后 node的值
        int m;   //相加后的 进位
        if(l1!=null&&l2!=null){
            valAdd=l1.val+l2.val+n;
            l1.val=valAdd%10;
            m=valAdd/10;
            l1.next=add(l1.next,l2.next,m);
            return l1;

        }else if(l1!=null){
            valAdd=l1.val+n;
            l1.val=valAdd%10;
            m=valAdd/10;
            l1.next=add(l1.next,null,m);
            return l1;

        }else if(l2!=null){
            valAdd=l2.val+n;
            l2.val=valAdd%10;
            m=valAdd/10;
            l2.next=add(null,l2.next,m);
            return l2;
        }else{
            if(n>0){
                return new ListNode(n);
            }else{
                return null;
            }
        }
    
    }
}