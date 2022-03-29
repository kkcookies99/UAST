 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if not head:
            return head
        pre = head
        cur = pre.next
        while cur:
            if cur.val == pre.val:
                pre.next = cur.next
                cur = cur.next
            else:
                pre, cur = cur, cur.next
        return head

