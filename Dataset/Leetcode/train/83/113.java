class Solution {
    public ListNode XXX(ListNode head) {
      ListNode l1=head;
      if (head == null || head.next == null) return head;
      else{
      while(l1!=null&&l1.next!=null)
      {
          ListNode Next=l1.next;
          if(l1.val!=Next.val)
          {
              l1=Next;
          }
          if(l1.val==Next.val)
          {
            // if(Next.next==null){l1.next=null;}
            // else{
             l1.next=Next.next;
            //  l1=Next.next;
              }
          }
        //   if((l1.val==Next.val)&&(Next.next==null))
        //   {
        //      l1.next=null;
        //   }
      }
      return head;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


