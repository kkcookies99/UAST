class Solution:
    def XXX(self, l1, l2):
        pre=0
        first = ListNode(0)
        curr = first
        while(l1 != None) or (l2 != None):
            if l1==None:
                x=0
            else:
                x=l1.val
                l1=l1.next
            if l2==None:
                y=0
            else:
                y=l2.val
                l2=l2.next
            sum = x+y+pre
            mod = sum%10
            pre = sum//10
            curr.next=ListNode(mod)
            curr=curr.next
        if pre==1:
            curr.next=ListNode(1)
        return first.next

