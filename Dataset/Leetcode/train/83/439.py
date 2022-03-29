 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if not head:
            return head
        dummy = ListNode(-1)
        dummy.next = head

        while head and head.next:
            if head.val != head.next.val:
                head = head.next
            else:
                while head and head.next and head.val == head.next.val:
                    head.next = head.next.next

        return dummy.next

