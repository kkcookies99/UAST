 class Solution {
    public ListNode XXX(ListNode head, int n) {
		ListNode ln1=head;
		ListNode ln2=head;
		if(head.next==null && n==1){
			return null;
		}else{
			for(int i=1;i<=n;i++){
				ln2=ln2.next;
			}
			if(ln2==null){
				head=head.next;
				return head;
			}else{
				while(ln1.next!=null && ln2.next!=null){
					ln1=ln1.next;
					ln2=ln2.next;
				}
				ln1.next=ln1.next.next;
			}
			return head;
		}
    }
}

