"""
直观版本，再创建一个链表用来存结果
"""
class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        # 头结点，方便后续的操作
        head = ListNode()
        p = head
        # 保存进位
        jinwei = 0
        
        while l1 and l2:
            r = l1.val + l2.val + jinwei
            new = ListNode(r % 10)
            p.next = new
            p = new
            jinwei = r // 10
            l1 = l1.next
            l2 = l2.next

        while l1:
            r = l1.val + jinwei
            new = ListNode(r % 10)
            p.next = new
            p = new
            jinwei = r // 10
            l1 = l1.next
            
        while l2:
            r = l2.val + jinwei
            new = ListNode(r % 10)
            p.next = new
            p = new
            jinwei = r // 10
            l2 = l2.next
            
        # 如果最后还有进位也要加上    
        if jinwei:
            p.next = ListNode(1)

        return head.next

