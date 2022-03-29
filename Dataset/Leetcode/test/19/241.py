 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode(617)
        dummy.next = head
        fast = dummy
        slow = fast
        for _ in range(n):
            fast = fast.next
        while fast.next:
            fast = fast.next
            slow = slow.next
        slow.next = slow.next.next
        return dummy.next

