 class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        p = l1
        pre = ListNode(0)
        pre.next = l1
        r = 0
        while l1 and l2:
            l1.val += r
            r = (l1.val+l2.val) // 10
            l1.val = (l1.val + l2.val) %10
            pre = l1
            l1 = l1.next
            l2 = l2.next
        if(l1 == None):
            pre.next = l2
        l1 = pre.next
        while l1 and r == 1:
            l1.val += r
            r = l1.val // 10
            l1.val %= 10
            pre = l1
            l1 = l1.next
        if r == 1:
            nod = ListNode(1)
            pre.next = nod
        return p

