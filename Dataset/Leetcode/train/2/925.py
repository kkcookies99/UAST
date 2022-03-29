 class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        dummy = ListNode(float("inf"))
        # 记录节点
        res = dummy
        # flag为0不进1，flag为1需要进1
        flag = 0
        while l1 or l2:
            # 如果l1或者l2已经遍历完了，但是另一边还有，则加0
            if l1 is None:
                l1 = ListNode(0)
            if l2 is None:
                l2 = ListNode(0)

            # 加法逻辑
            if  flag == 0:
                if l1.val + l2.val < 10:
                    dummy.next =  ListNode(l1.val + l2.val)
                    flag = 0
                else:
                    dummy.next =  ListNode(l1.val + l2.val - 10)
                    flag = 1
            elif flag == 1:
                if l1.val + l2.val + 1 < 10:
                    dummy.next =  ListNode(l1.val + l2.val + 1)
                    flag = 0
                else:
                    dummy.next =  ListNode(l1.val + l2.val + 1 - 10)
                    flag = 1
            l1 = l1.next
            l2 = l2.next
            dummy = dummy.next

        # 最高位是否需要进位
        if flag == 1:
            dummy.next = ListNode(1)
        return res.next
