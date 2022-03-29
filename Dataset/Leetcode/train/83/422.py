 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        a=head
        while a and a.next:
            if a.val != a.next.val:
                a=a.next
            else:
                a.next=a.next.next
        return head

