class Solution(object):
    def XXX(self, head):
        pre, cur = head, head
        while cur:
            if pre.val == cur.val:
                pre.next = cur.next
            else:
                pre = cur
            cur = cur.next
        return head

