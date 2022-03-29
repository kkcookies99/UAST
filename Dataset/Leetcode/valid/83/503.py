 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head
        tail=self.XXX(head.next)
        if head.val==tail.val:
            return tail
        head.next=tail
        return head

