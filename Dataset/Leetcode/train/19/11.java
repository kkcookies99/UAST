  public ListNode XXX(ListNode head, int n) {
          ListNode myList= new ListNode(-1,head);
          int len=getLength(head);
          ListNode temp=myList;
         for(int i=0;i<=(len-n);i++){
            temp= temp.next;
         }
         temp.next=temp.next.next;
         return myList.next;
    }
    private int getLength(ListNode head){
        int res=0;
        while(head.next!=null){
            res++;
            head=head.next;
        }
        return res;
    }

