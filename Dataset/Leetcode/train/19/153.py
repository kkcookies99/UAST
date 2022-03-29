 class Solution:
    def XXX(self, head, n):
        dumpy = ListNode(0)
        dumpy.next = head
        node1 = dumpy
        node2 = dumpy
        while node1:
            node1 = node1.next
            if n >= 0:
                n -= 1
            else:
                node2 = node2.next
        node2.next = node2.next.next
        return dumpy.next

