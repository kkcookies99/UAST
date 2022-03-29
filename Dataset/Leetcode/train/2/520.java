  public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode last = new ListNode(0);
        ListNode temp = new ListNode(0);
        temp.next = last;
       
        while(l1 != null || l2 != null){
            ListNode now = new ListNode(0);
            
            //相加得到和
            if(l1 != null && l2 != null) now.val = l1.val + l2.val;
            else if(l1 == null) now.val = l2.val;
            else now.val = l1.val;
        
            //l1,l2向下遍历
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            if(now.val > 9){
                now.val = now.val - 10; //如果此次相加结果>9，说明需要进位
                if(l1 == null && l2 == null) l1 = new ListNode(1);
                else if(l1 != null) l1.val++;
                else l2.val++;
            }
            last.next = now; //进入下一次相加，last指针更新
            last = now;
        }
        return temp.next.next; //返回第一次相加的now节点     
    }

