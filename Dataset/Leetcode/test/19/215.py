     def XXX(self, head: ListNode, n: int) -> ListNode:
        if head.next is None:
            return None 
        length = 0
        flag = head 
        while head is not None:
            head=head.next
            length = length + 1
        head = flag 
        flag = head
        n = length-n
        former = None 
        while n!=0:
            former = head 
            head=head.next
            n = n - 1
        if former is None:
            head = head.next 
        else:
            former.next = head.next
            head = flag 
        return head

