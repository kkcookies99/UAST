class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
       if(l2 == null) {
	     return l1;
	}else if(l1 == null && l2 != null){
		return l2;     
	}else {			
		l1.val = l1.val+l2.val;	
		jinwei(l1);
		l1.next = XXX(l1.next,l2.next);	
		return l1;
	}
  }
  public void jinwei(ListNode l1) {
	if(l1.val>9) {					
            if(l1.next == null){
                l1.next = new ListNode(l1.val/10);
            }else{
                l1.next.val += l1.val/10;
                jinwei(l1.next);
            }
      l1.val %= 10;
      }
    }
}

