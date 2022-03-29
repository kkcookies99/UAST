 class Solution(object):
    def XXX(self, head):
        if not head:
            return head
        pre, cur = head, head.next
        while cur:
            if cur.val == pre.val:
                pre.next = cur.next
            else:
                pre = pre.next
            cur = cur.next
        return head
        

