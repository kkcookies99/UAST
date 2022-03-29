 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        """
        双指针
        执行用时 :40 ms, 在所有 Python3 提交中击败了47.81%的用户
        内存消耗 :13.4 MB, 在所有 Python3 提交中击败了9.61%的用户
        Running Time: 79.40μs
        :param head:
        :param n:
        :return:
        """
        p, q = head, head
        for cur in range(n):
            if p:
                p = p.next
            else:
                return head
        if not p:
            head = head.next    # 要删除结点是头结点
            return head
        while p.next:
            p, q = p.next, q.next
        q.next = q.next.next
        return head

