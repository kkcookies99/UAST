 class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        carry = 0
        node = ListNode()
        ans = node
        while l1 != None and l2 != None:
            carry, digit = (l1.val + l2.val + carry) // 10, (l1.val + l2.val + carry) % 10
            node.next = ListNode(digit)
            node, l1, l2 = node.next, l1.next, l2.next


        if l1:
            while l1 != None:
                carry, digit = (l1.val + carry) // 10, (l1.val + carry) % 10
                node.next = ListNode(digit)
                node, l1 = node.next, l1.next
        else:
            while l2 != None:
                carry, digit = (l2.val + carry) // 10, (l2.val + carry) % 10
                node.next = ListNode(digit)
                node, l2 = node.next, l2.next

        if carry:
            node.next = ListNode(carry)

        return ans.next

