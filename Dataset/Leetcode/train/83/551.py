 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if head is None or head.next is None:
            return head
        cur = head
        nex = head.next
        while nex:
            if cur.val != nex.val:
                cur = nex
            else:
                cur.next = nex.next
            nex = nex.next
        return head

