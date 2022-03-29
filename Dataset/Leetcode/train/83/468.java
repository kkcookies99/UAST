  public ListNode XXX(ListNode head) {
        
        return find(head,-100);
    }
    public ListNode find(ListNode head,int val) {
        if (head == null) return null;
        if (head.val == val) {
            return find(head.next,head.val);
        } else {
            head.next = find(head.next,head.val);
        }
        return head;
    }

