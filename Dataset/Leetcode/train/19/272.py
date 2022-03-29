 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        pn = p = head
        for i in range(n):
            p = p.next
        if p == None:
            # 说明删除的是第一个元素
            return head.next
        while True:
            if p == None or p.next == None:
                break
            else:
                p = p.next
                pn = pn.next
        if pn.next == None:
            head = None
        else:
            pn.next = pn.next.next
        return head

