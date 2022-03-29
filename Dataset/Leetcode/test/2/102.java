class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
          ListNode re=new ListNode(0);
          ListNode t1=l1,t2=l2;
          ListNode pre=re;
          int temp=0;
          if(t1==null) return t2;
          if(t2==null) return t1;
          while(t1!=null&&t2!=null){          
                     ListNode cur=new ListNode((t1.val+t2.val+temp)%10);
                     pre.next=cur;
                     pre=pre.next;
                     temp=(t1.val+t2.val+temp)/10;
                     t1=t1.next;
                     t2=t2.next;     
          }
          while(t1==null&&t2!=null){
               ListNode cur=new ListNode((temp+t2.val)%10);
                pre.next=cur;
                pre=pre.next;
              temp=(temp+t2.val)/10;
              t2=t2.next;
          } 
          while(t1!=null&&t2==null){
              ListNode cur=new ListNode((temp+t1.val)%10);
                pre.next=cur;
                pre=pre.next;
              temp=(t1.val+temp)/10;
              t1=t1.next;
          }
          if(temp>0){
              pre.next=new ListNode(temp);
            //   System.out.print(1);
          }
          return re.next;
    }
}

