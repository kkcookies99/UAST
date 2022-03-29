 public ListNode XXX(ListNode head, int n) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode slow=dummy,fast=dummy;
        for(int i=0;i<=n;i++)
            fast=fast.next;
        while(fast!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }

