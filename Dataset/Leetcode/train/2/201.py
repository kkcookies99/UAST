class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        result = l1
        carry = 0

        while True:
            c = l1.val + l2.val + carry
            l1.val, carry = c % 10, c // 10

            if not l1.next and not l2.next:
                break
            
            if not l1.next:
                l1.next = ListNode(0)
            elif not l2.next:
                l2.next = ListNode(0)

            l1 = l1.next
            l2 = l2.next
        
        if carry:
            l1.next = ListNode(1)
        
        return result

