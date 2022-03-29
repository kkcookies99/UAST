 class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        a = l1
        b = l2
        m = 0
        n = 0
        i = 0
        while a:
            m += (a.val*(10**i))
            a = a.next
            i += 1
        i = 0
        while b:
            n += (b.val*(10**i))
            b = b.next
            i += 1
        return list(map(int, str(m + n)[::-1]))

