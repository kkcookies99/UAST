 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        v_head = ListNode()
        v_head.next = head
        p = q = v_head
        for _ in range(n):
            q = q.next
        while q.next:
            p = p.next
            q = q.next
        p.next = p.next.next
        return v_head.next


