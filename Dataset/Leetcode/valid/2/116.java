class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        res1 = res2 = ''
        while l1:
            res1 += str(l1.val)
            l1 = l1.next
        while l2:
            res2 += str(l2.val)
            l2 = l2.next
        res = str(int(res1[::-1]) + int(res2[::-1]))
        

        root = ListNode(val=int(res[-1]))
        temp = root

        for i in range(len(res)-2,-1,-1):
            temp.next = ListNode(val=int(res[i]))
            temp = temp.next
        return root

