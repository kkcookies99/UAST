 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode()
        dummy.next = head
        slow, fast, pre = head, head, dummy
        while fast:
            if n:
                fast = fast.next
                n -= 1
            else:
                pre = slow
                fast = fast.next
                slow = slow.next
        pre.next = slow.next
        return dummy.next

