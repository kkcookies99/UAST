 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        array = []
        cur = head
        while cur:
            array.append(cur)
            cur = cur.next
        if n == len(array):
            head = head.next
        else:
            array[-n-1].next = array[-n-1].next.next
        return head

