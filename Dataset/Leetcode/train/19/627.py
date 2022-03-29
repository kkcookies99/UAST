 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        m = head
        stack = []
        while m:
            stack.append(m.val)
            m = m.next
        stack.pop(-n)
        new = ListNode()
        k = new 
        for i in stack:
            l = ListNode()
            l.val = i
            k.next = l
            k = k.next
        return new.next

