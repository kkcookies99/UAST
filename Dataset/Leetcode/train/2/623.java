 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        int num = 0;
        if(l1 == null && l2 == null){
            return null;
        }
        if(l1 != null && l2 != null){
            num = l1.val+l2.val;
        }else if(l1 != null){
            num = l1.val;
        }else if(l2 != null){
            num = l2.val;
        }
        if(num >= 10){
            num = num%10; 
            if(l1 != null && l1.next != null){
                l1.next.val++;
            }else if(l2 != null && l2.next != null){
                l2.next.val++;
            }else{
                l3.next = new ListNode(1);
            }
        }
        l3.val = num;
        ListNode l = XXX(l1==null?null:l1.next,l2==null?null:l2.next);
        l3.next = l==null?l3.next:l;
        return l3;
    }
}

