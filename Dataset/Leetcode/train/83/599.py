 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if(head==None):
            return []
        pr=head
        while(pr.next!=None):
            p=pr.next
            if(pr.val==p.val):
                pr.next=p.next
            else:
                pr=p
        return head
        ```

