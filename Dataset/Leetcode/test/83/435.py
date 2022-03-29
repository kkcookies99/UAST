 class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        res=set()
        tmp=head
        
        while head:
            if head.val not in res:  #该head 节点不在res里，保存head.val, 并记录该节点为pre
                pre=head
                res.add(head.val)
                head=head.next       #移动到下一个节点
            else:                             #在res里， 删除该节点
                pre.next=head.next
                head=head.next
           
        return tmp

