class Solution(object):
    def XXX(self, head):
        res = head
        while(res and res.next):
            if res.next.val == res.val:
                res.next = res.next.next
            else:
                res = res.next
        return head
