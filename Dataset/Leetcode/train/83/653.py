 class Solution(object):
    def XXX(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        a=head
        while a!=None and a.next!=None:
            if a.val==a.next.val:
                a.next=a.next.next
            else:
                a=a.next
        return head

