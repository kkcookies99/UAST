 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        stack = []

        p = head
        while p:
            stack.append(p)
            p = p.next
        
        k = 0
        h = None
        head = None
        while len(stack):
            node = stack.pop()
            k += 1
            if k == n:
                h = node.next
                head = h
            else:
                head = node

            if k - 1 == n:
                node.next = h

        return head

