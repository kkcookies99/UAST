class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        res = []
        while head:
            if head:
                res.append(head.val)
                head = head.next
        res = list(set(res))
        res.sort()
        if res:
            temp = None
            for i in range(len(res)):
                temp = ListNode(res.pop(),temp)
            return temp
        else:
            return head

