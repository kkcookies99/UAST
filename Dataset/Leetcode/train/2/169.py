class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        newln = l = ListNode
        carry = 0
        while not(l1 is None or l2 is None):
            s = l1.val + l2.val + carry
            carry = s // 10
            val = s % 10
            l1 = l1.next 
            l2 = l2.next
            if l1 is None and l2 is not None:
                l1 = ListNode()
            if l2 is None and l1 is not None:
                l2 = ListNode()
            b = ListNode(val=val)
            newln.next = b
            newln = b
            if l1 is None and l2 is None and carry>0:
                newln.next = ListNode(carry)
        return l.next

