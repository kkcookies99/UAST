class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        result = head

        while head and head.next:
            if head.val == head.next.val:
                head.next = head.next.next
            else:
                head = head.next

        return result

