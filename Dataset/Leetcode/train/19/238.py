 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        # 哑节点，省判断
        # head走n步，pre从哑结点出发再同步走
        # 当head走到null时，pre刚好走到要删除节点的前驱节点
        dummy = ListNode(next=head)
        pre = dummy
        for _ in range(n):
            head = head.next
        while head:
            head = head.next
            pre = pre.next
        pre.next = pre.next.next
        return dummy.next


