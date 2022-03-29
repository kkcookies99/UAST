 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        if(head.next==None):
            return None
        length = 1
        head1 = head
        while(head.next!=None):
            head = head.next
            length += 1
        tar = length-n-1
        if(length==n):
            return head1.next
        pre = 0
        head2 = head1
        while(pre!=tar):
            head1 = head1.next
            pre += 1
        head1.next = head1.next.next
        return head2

