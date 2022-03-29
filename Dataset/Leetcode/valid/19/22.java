     public ListNode XXX(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        // 元素只有一个
        fast = fast.next;
        if(fast==null)
            return null;  
        //      
        for(int i=2;i<n;i++)
            fast = fast.next;
            
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        // 删链尾
        if(n==1){
            slow.next = null;
            return head;
        }        
        //
        slow.val = slow.next.val;
        slow.next = slow.next.next;
        return head;
    }

