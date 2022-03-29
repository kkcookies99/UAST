class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if head is None or head.next is None:
            return head
        pre = head
        cur = head.next
        while cur:
            if pre.val == cur.val:
                cur = cur.next
                pre.next = cur
                continue
            else:
                pre = cur
                cur = cur.next
        return head

