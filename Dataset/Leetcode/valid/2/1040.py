 class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        q1 =l1
        q2=l2
        s=0
        j=0
        sum1_=0
        sum2_=0
        while q1:
            s=s+1
            sum1_ = sum1_+q1.val*(10**(s-1))
            q1 = q1.next
        while q2:
            j=j+1
            sum2_ = sum2_+q2.val*(10**(j-1))
            q2 = q2.next
        sum_ = sum1_ + sum2_
        sum_ =str(sum_)
        tmp_node = ListNode(None)
        node = ListNode(None)
        for x in sum_[::-1]:
            if not tmp_node.val:
                tmp_node.val = x
                node = tmp_node
            else:
                tmp_node.next = ListNode(x)
                tmp_node = tmp_node.next
        return node

