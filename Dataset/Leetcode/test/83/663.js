 var XXX = function(head) {
	let currLink = head
	while (currLink) {
		if (currLink.next && currLink.val === currLink.next.val) {
			currLink.next = currLink.next.next
		} else {
			currLink = currLink.next
		}
	}
	return head
};

