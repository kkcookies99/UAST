 public ListNode XXX(ListNode head) {
    if(head==null||head.next==null)return head;
    Set<Integer> set = new HashSet<Integer>();
    //首先，我们设定一个哨兵节点 "prehead" ，
    //这可以在最后让我们比较容易地返回合并后的链表。
    //我们维护一个 prev 指针，我们需要做的是调整它的 next 指针。
    ListNode preHead = new ListNode(-1);
    ListNode prev = preHead;
    //维护一个当前链表的curr指针
    ListNode curr = head;
    while(curr!=null) {
    	//利用集合Set的唯一性，如果返回ture，表示没有重复，则可以添加
    	if(set.add(curr.val)) {
    		//保护链表后面的数据
    		ListNode temp = curr.next;
    		//单独取出curr对象
    		curr.next = null;
    		//将处理过的curr添加到新链表后面
    		prev.next = curr;
    		//新链表指针前移
    		prev = prev.next;
    		//把保存的数据放入curr指针
    		curr = temp;
    	}else {
    		//重复，直接跳过
    		curr = curr.next;
    	}
    }
	return preHead.next;
}

