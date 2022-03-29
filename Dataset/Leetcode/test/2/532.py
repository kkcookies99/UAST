 class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        c = False
        head, tail = None, None
        while l1 or l2:
            v1 = l1.val if l1 else 0
            v2 = l2.val if l2 else 0
            v = (v1 + v2 + c) % 10
            c = v1 + v2 + c > 9
            if head is None:
                head = ListNode(val=v)
                tail = head
            else:
                tail.next = ListNode(val=v)
                tail = tail.next
            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next
        if c:
            tail.next = ListNode(val=1)
            tail = tail.next
        return head

