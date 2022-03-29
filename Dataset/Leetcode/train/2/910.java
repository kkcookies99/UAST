 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode dummyhead = new ListNode();
        ListNode curnode = dummyhead;
        int sum=0,num=0,over=0;
        while(l1!=null&&l2!=null){
            sum = l1.val + l2.val + over;   //和
            num = sum%10;       //余数,新节点的值
            over = sum/10;          //进位

            curnode.next = new ListNode(num);       
            curnode = curnode.next;

            l1=l1.next;
            l2=l2.next;
        }
        // 三种情况退出循环
        if(l1==null && l2==null && over>0){        // 都走到链尾了但是还有进位
            curnode.next = new ListNode(over);
        }
        else if(l1!=null){              // l1未到链尾
            curnode.next = l1;
            while(over>0 && l1!=null){
                sum = l1.val + over;
                num = sum % 10;
                over = sum/10;

                l1.val = num;
                curnode = curnode.next;
                l1 = l1.next;
            }
            if(over>0){
                curnode.next = new ListNode(over);
            }
        }
        else if(l2!=null){              // l2未到链尾
            curnode.next = l2;
            while(over>0 && l2!=null){
                sum = l2.val + over;
                num = sum % 10;
                over = sum/10;
                
                l2.val = num;
                curnode = curnode.next;
                l2 = l2.next;
            }
            if(over>0){
                curnode.next = new ListNode(over);
            }
        }
        return dummyhead.next;
    }
}

