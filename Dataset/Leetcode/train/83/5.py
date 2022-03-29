class Solution(object):
    def XXX(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head == None:
            return None

        node = head
        while(node.next!=None):
            if(node.val == node.next.val):
                node.next = node.next.next
            else:
                node = node.next
        return head

