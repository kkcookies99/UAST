 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        fast=head
        slow=head
        pre=ListNode()
        while(fast and n>0):
            fast=fast.next
            n-=1
        
        if not fast:
            if n>0:
                return head
            else:
                pre=head.next
                head=pre
                return head
        
        pre.next=slow
        while(fast):
            pre=slow
            slow=slow.next
            fast=fast.next
        pre.next=slow.next
        return head
# 执行用时：40 ms, 在所有 Python3 提交中击败了75.83%的用户
# 内存消耗：14.8 MB, 在所有 Python3 提交中击败了77.06%的用户
————————————————
版权声明：本文为CSDN博主「黑黑白白君」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/m0_37621024/article/details/117857152

