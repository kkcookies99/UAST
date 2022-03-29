 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        a = head
        try:
            b = a.next
        except:
            return a
        while b is not None:
            if a.val == b.val:
                a.next = b.next
                b = b.next
                continue
            b = b.next
            a = a.next
        return head

