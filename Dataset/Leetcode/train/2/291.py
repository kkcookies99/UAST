class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        '''
        新建一个空列表
        先从头到尾的进行相加得到一个链表
        再从这个链表查找大于9的数，进行求余操作和进位
        '''
        L = ListNode(None)
        p = L
        R = ListNode(1)
        L = l1
        while l1 and l2:        #将l1和l2相加起来，暂不理会进位问题
            l1.val = l1.val + l2.val
            p = l1              #p在l1前面
            l1 = l1.next
            l2 = l2.next
        if l2:              #l2还有时，l1会为空，此时使用p
            p.next = l2
        l1 = L              #将l1重新指回新的链表头部
        while l1:           #从头遍历，进行进位和取余的操作
            if (l1.val > 9) and (l1.next ==None):       #最后一个需要新建链表的情况
                l1.val = l1.val%10
                l1.next = R
                return L
            elif (l1.val > 9):
                l1.val = l1.val%10
                l1.next.val += 1
            l1 = l1.next
        return L

