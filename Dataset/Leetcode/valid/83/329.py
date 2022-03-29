class Solution:
    def XXX(self, head: ListNode) -> ListNode:

        if not head:
            return head
        p1 = head
        while p1.next:
            n = p1.next
            if p1.val == n.val:
                p1.next = n.next
                del n
            else:
                p1 = p1.next
        return head

