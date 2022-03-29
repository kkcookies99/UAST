class Solution:
    def XXX(self, head):
        if head == None:
            return head

        p = head
        q = head

        while p != None:

            while q != None and q.val == p.val:
                q = q.next

            p.next = q
            p = q

        return head

