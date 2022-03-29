# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def XXX(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        
        n1 = l1 #用n1去遍历l1的节点
        n2 = l2 #用n2去遍历l2的节点
        
        flag = 0 #标记两数相加超过十时的进位操作
        
        while n1 or n2:#两个链表均遍历完就退出
                
            if not n1.next and n2 and n2.next:#当l1遍历完而l2还没遍历完，在l1后面添加个空白节点
                n1.next = ListNode(0)
                
            if n1 and n2:#两值相加
                n1.val += n2.val
            
            if n1.val >= 10:#两值相加超过十时，进位，flag on
                n1.val %= 10
                flag = 1 
                
            if flag:#进位操作，如果结点n1还有下个节点，给节点值加1，没有则建立一个初值为1的节点，flag off
                if n1.next:
                    n1.next.val += 1
                else:
                    n1.next = ListNode(1)
                flag = 0
                    
            #n1,n2节点遍历
            if n1:
                n1 = n1.next
            if n2:
                n2 = n2.next
            
            
        return l1

