 public ListNode XXX(ListNode head, int n) {       
        ListNode DummyNode = new ListNode();
        DummyNode.next = head;
        find(DummyNode,0,n);
        return DummyNode.next;
    }
    private int find(ListNode head, int i,int n){
        if(head == null || head.next == null)
            return i;       
          int s = find(head.next, i+1, n);
          if(s - i == n){
              head.next = head.next.next;
          }
          return s;
    }

