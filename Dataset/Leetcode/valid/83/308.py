class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        cur = head
        while cur and (nxt := cur.next):
            if nxt.val == cur.val:
                cur.next = nxt.next
            else:
                cur = nxt
        return head

