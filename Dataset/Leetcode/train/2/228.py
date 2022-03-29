class Solution:
    def XXX(self, l1, l2):
        tmpnode = ListNode(0) # 第一个节点需要舍弃
        res = tmpnode # 返回值
        add = 0 # 进位
        while l1 or l2:
            tmpsum = add
            if l1:
                tmpsum += l1.val
                l1 = l1.next
            
            if l2:
                tmpsum += l2.val
                l2 = l2.next
            
            add = tmpsum // 10
            tmpnode.next = ListNode(tmpsum % 10)
            tmpnode = tmpnode.next
        if add != 0: # 处理最后的进位
            tmpnode.next = ListNode(add)
        return res.next

