class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        p = ListNode(-1)
        start = p
        carry = 0
        while(l1 or l2):
            temp = (l1.val if l1 else 0) +\
                   (l2.val if l2 else 0) +\
                   carry
            carry = temp // 10
            p.next = ListNode(temp % 10)
            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next
            p = p.next
        if carry == 1:
            p.next = ListNode(carry)
        return start.next

