class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if not bool(head):
            return head
        else:
            curr=head            
            while curr.next:
                if curr.val==curr.next.val:
                    curr.next=curr.next.next                    
                else:                    
                    curr=curr.next
            return head

