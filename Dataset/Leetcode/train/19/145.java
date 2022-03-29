 class Solution {
    public ListNode XXX(ListNode head, int n) {
  	ListNode[] listNode = new ListNode[30];
  	int i = 0;
  	while(head!=null) {
  		listNode[i++] = head;
  		head = head.next;
  	}
  	//删除元素,假设删除倒数第一个元素
  	if (i-n!=0) {
  		listNode[i-n-1].next = listNode[i-n].next;
  		return listNode[0];
	}else {
        listNode[0]=listNode[0].next;
		return listNode[0];
	}
    }
}

