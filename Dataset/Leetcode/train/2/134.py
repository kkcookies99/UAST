class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        ans = ListNode(0)
        node = ans
        lastnode = None
        while True:
            if not l1 and not l2:
                if node.val == 0:
                    lastnode.next = None
                return ans
            if l1 and l2:
                s = l1.val + l2.val + node.val
                l1 = l1.next
                l2 = l2.next
            elif l1:
                s = l1.val + node.val
                l1 = l1.next
            elif l2:
                s = l2.val + node.val
                l2 = l2.next
            c = s // 10
            s = s % 10
            node.val = s
            node.next = ListNode(c)
            lastnode = node
            node = node.next

