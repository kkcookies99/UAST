     class Solution {
        public ListNode XXX(ListNode l1, ListNode l2) {
            ListNode res,temp;
            res=new ListNode(0);
            temp=res;
            int ten=0;
            int x=0,y=0;
            while(l1!=null||l2!=null){   
                x=l1==null?0:l1.val;
                y=l2==null?0:l2.val;
                temp.val=(x+y+ten)%10;
                ten=(x+y+ten)/10;
                l1=l1==null?null:l1.next;
                l2=l2==null?null:l2.next;
                if(l1!=null||l2!=null){
                    temp.next=new ListNode(0);
                    temp=temp.next; 
                }
            }
            if(ten!=0){
                temp.next=new ListNode(ten);
            }
            return res;
            
        }
    }
