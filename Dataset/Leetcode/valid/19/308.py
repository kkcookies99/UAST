 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        slow=head
        fast=head
        for i in range(n):
            fast=fast.next
        if fast==None:
            return slow.next
        else:
            fast=fast.next
        while fast:
            fast=fast.next
            slow=slow.next
        slow.next=slow.next.next
        return head
        

