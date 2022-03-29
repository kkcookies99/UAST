 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if not head:
            return head
        p=head
        while p.next:
            if p.val==p.next.val:
                p.next=p.next.next
            else:
                p=p.next
        return head

