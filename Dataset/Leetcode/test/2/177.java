class Solution {
  
    public ListNode sum( ListNode l1, ListNode l2, ListNode result, int index ){
        ListNode temp =new ListNode(0);
        temp.next=null;
        if(result!=null){
        if(l1!=null&&l2!=null){
                temp.val=l1.val+l2.val+index;
                if(temp.val>=10){
                    index=temp.val/10;
                    temp.val=temp.val%10;
                    result.next=temp;
                    result= result.next;
                    sum(l1.next,l2.next,result,index);
                }
                else{
                    index=0;
                    result.next=temp;
                    result= result.next;
                    sum(l1.next,l2.next,result,index);
                }
        }        
        else if(l1!=null&&l2==null){
                temp.val=l1.val+index;
                if(temp.val>=10){
                    index=temp.val/10;
                    temp.val=temp.val%10;
                    result.next=temp;
                    result= result.next;
                    sum(l1.next,l2,result,index);
                }
                else{
                    index=0;
                    result.next=temp;
                    result= result.next;
                    sum(l1.next,l2,result,index);
                }
        }
        else if(l1==null&&l2!=null){
            temp.val=l2.val+index;
                if(temp.val>=10){
                    index=temp.val/10;
                    temp.val=temp.val%10;
                    result.next=temp;
                    result= result.next;
                    sum(l1,l2.next,result,index);
                }
                else{
                    index=0;
                    result.next=temp;
                    result= result.next;
                    sum(l1,l2.next,result,index);
                }
        } 
        else{
                if(index>=10){
                    index=temp.val/10;
                    temp.val=temp.val%10;
                    result.next=temp;
                    result= result.next;
                    sum(l1,l2,result,index);
                    
                }
                else if(index>=1){
                    temp.val=index;
                    index=0;
                    result.next=temp;
                    return result;
                }
                else if(index==0){
                    result=null;
                    return result;
                }
                
                   
        }
        }
              
        return result;
 
    }
    public ListNode XXX(ListNode l1, ListNode l2) {
         ListNode result =new ListNode(0);
         result.next=null;
         sum(l1,l2,result,0);
         return result.next;
    }  
     
}

