class Solution:
    def XXX(self, l1: ListNode, l2: ListNode) -> ListNode:
        # 遍历两个链表，得到两个链表的值
        num1_str=""
        num2_str=""
        while l1 or l2:
            if l1: 
                num1_str=num1_str+str(l1.val)
                l1=l1.next
            if l2:
                num2_str=num2_str+str(l2.val)
                l2=l2.next
        num1=int(num1_str[::-1])
        num2=int(num2_str[::-1])
        # 计算得到结果，把结果重新组合成一个链表返回
        sum_num=num1+num2
        next_node=None
        for one in str(sum_num):
            one_int=int(one)
            ln=ListNode(one_int)
            ln.next=next_node
            next_node=ln
        return ln

