class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode result = l1;
        //两链表各元素相加
        while(l2!=null){
            l1.val=l1.val+l2.val;
            l2=l2.next;
            if(l1.next==null){
                l1.next = new ListNode(0);
            }
            l1 = l1.next;
        }
        //判断每个元素是否大于10
        l1=result;
        while(l1.next!=null){
            if(l1.val>9){
                l1.next.val=l1.next.val+l1.val/10;
                l1.val=l1.val%10;
            }
            if(l1.next.val==0&&l1.next.next==null){
                l1.next=null;
            }else{
                l1=l1.next;
            }
        }
        //判断最后一个元素是否大于10
        if(l1.val>9){
            l1.next=new ListNode(0);
            l1.next.val=l1.next.val+l1.val/10;
            l1.val=l1.val%10;
        }
        return result;
    }
}

