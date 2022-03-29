 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        """遍历一遍
        左右两个指针，相距 n
        p     q
        ↓     ↓
        1, 2, 3, 4, 5
              ↑     ↑
              p     q
        """
        p = q = head
        for i in range(n):
            q = q.next
        if not q:
            return head.next
        # 以 q 为最后一个节点为终止条件
        while q := q.next:  
            p = p.next
        p.next = p.next.next
        return head

