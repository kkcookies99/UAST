class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        p1 = l1
        p2 = l2
        res = ListNode()
        res_head = res
        carry = 0
        while p1 and p2:
            res.next = ListNode()
            res = res.next
            res.val = p1.val + p2.val + carry
            carry = 0
            if res.val >= 10:
                res.val = res.val % 10
                carry = 1
            p1 = p1.next
            p2 = p2.next
        
        while p1 and not p2:
            res.next = ListNode()
            res = res.next
            res.val = p1.val + carry
            carry = 0
            if res.val >= 10:
                res.val = res.val % 10
                carry = 1
            p1 = p1.next

        while not p1 and p2:
            res.next = ListNode()
            res = res.next
            res.val = p2.val + carry
            carry = 0
            if res.val >= 10:
                res.val = res.val % 10
                carry = 1
            p2 = p2.next

        if carry == 1:
            res.next = ListNode(1,None)
        return res_head.next

