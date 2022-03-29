 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode head=l2;
        ListNode pre=new ListNode();
        while(l1!=null&&l2!=null){
            l2.val+=l1.val;
            if(l2.val>=10){
                l2.val=l2.val%10;
                if(l2.next==null)
                    l2.next=new ListNode();
                l2.next.val+=1;
            }
            pre=l2;
            l1=l1.next;
            l2=l2.next;
        }
        if(l2==null){//将l1比l2长的一段连到l2上
            pre.next=l1;
        }
        while(l2!=null){//继续判断后面数字相加后是否超过十位
            if(l2!=null&&l2.val>=10){
                l2.val=l2.val%10;
                if(l2.next==null)
                    l2.next=new ListNode();
                l2.next.val+=1;
            }
            l2=l2.next;
        }   
        return head;
    }
}

