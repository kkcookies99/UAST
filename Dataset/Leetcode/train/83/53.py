class Solution(object):
    def XXX(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        s = set()
        pre = ListNode(float('INF'))
        pre.next = head
        ret = pre
        while head:
            if head.val not in s:
                s.add(head.val)
                pre = pre.next
            else:
                pre.next = head.next
            head = head.next
        return ret.next

