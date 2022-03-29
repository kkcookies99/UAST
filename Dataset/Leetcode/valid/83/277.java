public ListNode XXX(ListNode head) {
        ListNode pre = null, curr = head;
        while(curr != null){
            if(pre != null && pre.val == curr.val){
                pre.next = curr.next;
                curr = pre.next;
            }else{
                pre = curr;
                curr = curr.next;
            }
        }
        return head;
    }

