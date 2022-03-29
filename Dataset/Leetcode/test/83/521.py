 class Solution(object):
    def XXX(self, head):
        dummy=head
        p=dummy
        while p:
            if p.next == None :
                return dummy
            elif p.val==p.next.val:
                p.next=p.next.next
            else :
                p= p.next
        return dummy

