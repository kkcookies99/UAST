 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        #快慢指针 
        virtual = ListNode(0,head) #virtual.next = head 
        fast = head 
        slow = virtual
        #快指针先行前进前进n步,即fast和slow之间相隔2个节点。n是小于列表长度的 
        for _ in range(n):
            fast = fast.next

        while fast:
            fast = fast.next 
            slow = slow.next 
        
        slow.next = slow.next.next 
        return virtual.next #这里不能直接返回head,修改的是slow,也就是vitual

