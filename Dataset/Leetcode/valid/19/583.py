     def XXX(self, head: ListNode, n: int) -> ListNode:
        fake = ListNode(0, head)
        fast = fake
        while n >= 0:
            fast = fast.next
            n -= 1
        slow = fake
        while fast:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return fake.next

