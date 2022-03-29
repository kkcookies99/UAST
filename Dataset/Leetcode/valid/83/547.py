 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if(head==None):return None
        slow=head
        fast=head.next
        while(fast!=None):
            if(slow.val!=fast.val):
                slow=slow.next
                slow.val=fast.val
            fast=fast.next
        slow.next=None
        return head

