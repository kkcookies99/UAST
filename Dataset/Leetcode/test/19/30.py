 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        res = ListNode(0)
        res.next = head
        cur = head
        while n > 0:
            cur = cur.next
            n -= 1
        pre = res
        tmp = head
        while cur:
            cur = cur.next
            pre = tmp
            tmp = tmp.next
        pre.next = tmp.next
        return res.next

