 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        pre = cur = head
        for i in range(n):
            cur = cur.next
        if cur==None:
            return head.next
        while cur.next!=None:
            cur = cur.next
            pre = pre.next
            # print(cur)
        pre.next = pre.next.next
        return head

