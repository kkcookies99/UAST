 class Solution(object):
    def XXX(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        l = []
        while(head):
            l.append(head.val)
            head = head.next
        # print(l)
        l = l[::-1]
        del(l[n-1])
        l = l[::-1]
        
        # l.remove(l[len(l)-n])
        if len(l) == 0:
            return ListNode(None).next

        head = ListNode(l[0]) ## 头节点
        res = head ## 链表
        p = head ## 指针
        for i in l[1:]:
            node = ListNode(i)
            p.next = node
            p = p.next
        return res
