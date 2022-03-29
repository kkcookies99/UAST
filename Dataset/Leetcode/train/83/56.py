class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        o = head
        p = None
        while head is not None:
            if p is not None and head.val == p.val:
                p.next = head.next 
            else:
                p = head 
            head = head.next 
        return o

