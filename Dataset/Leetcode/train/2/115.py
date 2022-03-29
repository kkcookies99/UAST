class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        l1_list = []
        l2_list = []
        while l1 or l2:
            if l1:
                l1_list.append(l1.val)
                l1 = l1.next
            if l2:
                l2_list.append(l2.val)
                l2 = l2.next
        res = int(''.join([str(i) for i in l1_list[::-1]])) + int(''.join([str(i) for i in l2_list[::-1]]))
        res = [int(i) for i in str(res)][::-1]
        if res:
            temp = None
            for i in range(len(res)):
                temp = ListNode(res.pop(),temp)
            return temp
        else:
            return l1

