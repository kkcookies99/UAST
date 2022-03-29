class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        a=[]
        while head:
            if head.val not in a:
                a.append(head.val)
            if head is not None:
                head=head.next
        
        dummyRoot = ListNode(0)
        ptr = dummyRoot
        for number in a:
            ptr.next = ListNode(number)
            ptr = ptr.next

        ptr = dummyRoot.next
        return ptr

