 public ListNode XXX(ListNode head, int n) {
        int count = 1;
        ListNode rvs = reverse(head);
        if(n==1){
            return reverse(rvs.next);
        }
        ListNode temp = rvs;
        while (temp != null){
            if(count == n-1){
                temp.next = temp.next.next;
            }
            temp = temp.next;
            count++;
        }
        return  reverse(rvs);
    }
    public ListNode reverse(ListNode head){
        ListNode newList = new ListNode(0);
        ListNode t = null;
        while (head != null){
            t = head.next;
            head.next = newList.next;
            newList.next = head;
            head = t;
        }
        return newList.next;
    }

