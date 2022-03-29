 class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        c = False
        l1_f = l1.next is not None
        l2_f = l2.next is not None
        s = ListNode()
        result = s
        while l1_f or l2_f:
            ls = ListNode()
            s.next = ls
            s = ls
            if l1_f and l2_f:
                ls.val = (l1.val + l2.val + c) % 10
                c = l1.val + l2.val + c > 9
                l1, l2 = l1.next, l2.next
            elif l1_f and not l2_f:
                ls.val = (l1.val + l2.val + c) % 10
                c = l1.val + l2.val + c > 9
                l2.val = 0
                l1 = l1.next
            elif l2_f and not l1_f:
                ls.val = (l1.val + l2.val + c) % 10
                c = l1.val + l2.val + c > 9
                l1.val = 0
                l2 = l2.next
            l1_f = l1.next is not None
            l2_f = l2.next is not None
        else:
            ls = ListNode()
            s.next = ls
            s = ls
            ls.val = (l1.val + l2.val + c) % 10
            if l1.val + l2.val + c > 9:
                ls = ListNode(val=1)
                s.next = ls
        return result.next

