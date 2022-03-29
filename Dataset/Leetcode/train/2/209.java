public ListNode XXX(ListNode l1, ListNode l2) {
	ListNode list=new ListNode(0);
	ListNode cur=list;
	int flag=0;
	while(l1!=null||l2!=null) {
		if(l1==null) l1=new ListNode(0);
		if(l2==null) l2=new ListNode(0);
		
		cur.next=new ListNode((flag+l1.val+l2.val)%10);
		flag=((flag+l1.val+l2.val)>=10 ? 1:0);
		cur=cur.next;
		l1=l1.next;
		l2=l2.next;
	}
	
	if(flag==1) cur.next=new ListNode(1);
	return list.next;
}

