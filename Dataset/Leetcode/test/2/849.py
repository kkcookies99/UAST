 class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        a1 = ""
        a2 = ""
        while l1 !=None:
            a1 +=str(l1.val)
            l1 = l1.next
        while l2 !=None:
            a2 +=str(l2.val)
            l2 = l2.next
        a1 = a1[::-1]
        a2 = a2[::-1]
        vals = int(a1)+int(a2)
        vals = str(vals)
        head = res = ListNode(0)
        for i in vals[::-1]:
            tempNode = ListNode(int(i))
            res.next = tempNode
            res = res.next
        return head.next

