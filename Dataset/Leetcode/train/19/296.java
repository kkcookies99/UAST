  public ListNode XXX(ListNode head, int n) {
       ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode left = dummyHead, right = head;
        int count = 1;
        while (right.next != null) {
            right = right.next;
            count++;
            if (count == n) {
                left = left.next;
            }else if (count >= n){
                pre=pre.next;
                left=left.next;
            }

        }
        pre.next = left.next;
        left.next = null;
        return dummyHead.next;
    }

