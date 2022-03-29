 class Solution(object):
    def XXX(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head:
            return head
        now = head
        after = head.next
        while after!=None:
            if now.val==after.val:
                now.next=after.next
            else:
                now=after
            after = after.next

        return head

