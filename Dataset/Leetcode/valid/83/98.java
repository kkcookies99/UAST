 public ListNode XXX(ListNode head) {
       HashSet<Integer> hs=new HashSet();
       if(head!=null&&head.next!=null)
        hs.add(head.val);
        ListNode preNod=head;
       while(preNod!=null&&preNod.next!=null){
             ListNode temp=preNod.next;
             if(hs.contains(temp.val)){
                preNod.next=temp.next;
             }
             else{
                 preNod=preNod.next;
                  hs.add(preNod.val);
             }
       }
    return head;
    }

