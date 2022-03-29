class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if not head or not head.next: return head
        dummy = head
        while head and head.next:
            if head.val == head.next.val:
                head.next = head.next.next
            else:
                head = head.next
        return dummy 

