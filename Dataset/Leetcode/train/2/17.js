func XXX(l1 *ListNode, l2 *ListNode) *ListNode {
	var l3 ListNode
	var val1 int
	var val2 int
	if l1 == nil && l2 == nil {
		return nil
	}
	if l1 != nil {
		val1 = l1.Val
	}
	if l2 != nil {
		val2 = l2.Val
	}
	if val1 + val2 < 10 {
		l3.Val += val1 + val2
	} else {
		l3.Val = val1 + val2 - 10
		if l1.Next == nil {
			l1.Next = &ListNode{}
		}
		l1.Next.Val += 1
	}
	if l1 != nil && l2!= nil && l1.Next != nil && l2.Next != nil {
		l3.Next = XXX(l1.Next, l2.Next)
	} else if l1 != nil && l1.Next != nil {
		l3.Next = XXX(l1.Next, nil)
	} else if l2!= nil && l2.Next != nil {
		l3.Next = XXX(nil, l2.Next)
	}
	return &l3
}

