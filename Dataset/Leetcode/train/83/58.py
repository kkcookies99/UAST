class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        p = head
        if p==None or p.next == None:
            return head
        while p.next:
            if p.val == p.next.val:
                p.next = p.next.next
            else:
                p = p.next
        return head

