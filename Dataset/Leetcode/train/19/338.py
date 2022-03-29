 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        # 注意使用哑节点，避免删除的节点是head节点时出现错误
        fast,ans = head,ListNode(0,head) 
        slow = ans
        for i in range(n):
            fast = fast.next
        while(fast):
            fast = fast.next
            slow = slow.next
        slow.next = slow.next.next
        return ans.next

