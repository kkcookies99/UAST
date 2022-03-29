 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        front=ListNode(0)
        front.next,fast,slow=head,front,front
        while(n or fast):
            if n:fast,n=fast.next,n-1
            else:
                fast=fast.next
                slow=slow.next if fast else slow
        slow.next=slow.next.next 
        return front.next 

