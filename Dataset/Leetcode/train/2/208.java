class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode cur1 = l1; 
        ListNode cur2 = l2;
        int count = 0;//每位之和
        int s = 0;//进位
        
        while(cur1.next != null && cur2.next != null){//加到其中有一个链表剩一位，或者两个链表都只剩一位
            count = cur1.val + cur2.val + s;
            if(count > 9){
                cur1.val = count % 10 ;
                cur2.val = count % 10 ;
                s = 1;
            }else{
                cur1.val = count;
                cur2.val = count;
                s = 0;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
            
        }
        
        if(cur1.next == null && cur2.next == null){ //当两个链表都只剩一位时
            count = cur1.val + cur2.val +s;
            if(count > 9)
            {
                cur1.val = count % 10;
                cur2.val = count % 10;
                s = 1;
            }else{
                cur1.val = count ;
                cur2.val = count ;
                s = 0;
            }
            if(s == 1){  //说明最后两个数产生了进位，需要扩充链表。
                ListNode tmp = new ListNode(1);
                cur1.next = tmp;
                return l1;
            }
            return l1;
        }
        
        if(cur1.next == null){  //cur1链表剩一位
            count = cur1.val + cur2.val + s ;
            cur2.val = cur1.val + cur2.val;
            if(count < 10){  //cur1的最后一位加cur2的一位 没产生进位，直接返回
                cur2.val = count;
                return l2;
            }
            while(cur2.next != null){  //因为有进位，需要再把cur2的剩余数计算 直到最后一位
               count =  cur2.val + s;
               if(count > 9){
                   cur2.val = count % 10 ;
                   s = 1;
               } else{
                   cur2.val = count;
                   s = 0;
               }
                cur2 = cur2.next;
            }
            if(cur2.val + s > 9){  //判断cur2 最后一位是否产生进位
                cur2.val = (cur2.val + s) % 10;
                s = 1;
            }else{
                cur2.val = cur2.val +s;
                s = 0;
            }
            if(s == 1){  //产生进位，扩充链表
                ListNode tmp = new ListNode(1);
                cur2.next = tmp;
                return l2;
            }
            return l2;
        }else{  //cur2链表剩一位
            count = cur1.val + cur2.val + s;
            cur1.val = cur2.val + cur1.val;
            if(count < 10){ //cur2的最后一位加cur1的一位 没产生进位，直接返回
                cur1.val = count;
                return l1;
            }
            while(cur1.next != null){ //因为有进位，需要再把cur1的剩余数计算 直到最后一位
               count =  cur1.val + s;
               if(count > 9){
                   cur1.val = count % 10 ;
                   s = 1;
               } else{
                   cur1.val = count;
                   s = 0;
               }
                cur1 = cur1.next;
            }
            if(cur1.val + s > 9){  //判断cur1 最后一位是否产生进位
                cur1.val = (cur1.val + s) % 10;
                s = 1;
            }else{
                cur1.val = cur1.val +s;
                s = 0;
            }
            if(s == 1){  //产生进位，扩充链表
                ListNode tmp = new ListNode(1);
                cur1.next = tmp;
                return l1;
            }
        }
        return l1;
    }
}


