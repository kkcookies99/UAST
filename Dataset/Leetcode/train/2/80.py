# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def XXX(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        c1=[]
        c2=[]
        while l1: #将l1链表存入列表c1
            c1.append(l1.val)
            l1=l1.next
        while l2: #将l2链表存入列表c2
            c2.append(l2.val)
            l2=l2.next
        j1=-1
        j2=-1
        sum1=0
        sum2=0
        for i in range(len(c1)): #计算c1数值
            sum1=sum1*10+c1[j1]
            j1=j1-1
        for i in range(len(c2)): #计算c2数值
            sum2=sum2*10+c2[j2]
            j2=j2-1
        res=sum1+sum2 #两数之和
        p=head=node=ListNode(None) #创建空head链表
        l=len(str(res)) #将int转为str方便后面循环
        while l:
            node=ListNode(res%10) #从后向前赋值给node节点
            p.next=node
            p=node
            res/=10
            l-=1
        return head.next #head一直是头节点，返回head.next

