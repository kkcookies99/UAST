 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if not head:
            return 
        dummy_head = head
        while head.next!=None:
            current_v = head.val
            if current_v==head.next.val:
                head.next = head.next.next
            else:
                head = head.next
        return dummy_head

