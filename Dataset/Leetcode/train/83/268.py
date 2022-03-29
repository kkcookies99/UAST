class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head
        dummy = head
        pre, cur = head, head.next
        while cur:
            while cur and cur.val == pre.val:
                cur = cur.next
            pre.next = cur
            if cur:
                pre, cur = pre.next, cur.next
        return dummy

