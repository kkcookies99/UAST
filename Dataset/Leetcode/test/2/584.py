 class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        newl1 = []
        newl2 = []
        while(l1):
            newl1.append(l1.val)
            l1 = l1.next
        while(l2):
            newl2.append(l2.val)
            l2 = l2.next
        newl1.reverse()
        newl2.reverse()
        sum = int("".join([str(i) for i in newl1]))+int("".join([str(i) for i in newl2]))
        newreturn = list(str(sum))
        newreturn.reverse()
        return [int(i) for i in newreturn]

