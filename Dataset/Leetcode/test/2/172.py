class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        dummy=ListNode(None)
        cur=dummy
        carry=0
        while l1 and l2:
            temp=l1.val+l2.val+carry
            cur.next=ListNode(temp%10)
            carry=temp//10
            l1=l1.next
            l2=l2.next
            cur=cur.next
        while l1:
            temp=l1.val+carry
            cur.next=ListNode(temp%10)
            carry=temp//10
            l1=l1.next
            cur=cur.next
        while l2:
            temp=l2.val+carry
            cur.next=ListNode(temp%10)
            carry=temp//10
            l2=l2.next
            cur=cur.next
        if carry==1:
            cur.next=ListNode(1)
        return dummy.next

