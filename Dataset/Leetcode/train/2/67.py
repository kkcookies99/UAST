class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        m, n = '', ''
        while l1:
            m, l1 = m + str(l1.val), l1.next
        while l2:
            n, l2 = n + str(l2.val), l2.next
        return list(map(int, str(int(m[::-1]) + int(n[::-1]))[::-1]))

