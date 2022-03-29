class Solution(object):
    def XXX(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        # 思路：创建hash表，保留前一个位置的游标，用来删除节点
        hash_list = []
        ptr = head
        while ptr != None:         
            if ptr.val not in hash_list:
                hash_list.append(ptr.val)
                pre_ptr = ptr
                ptr = ptr.next
            else:
                pre_ptr.next = ptr.next
                ptr = ptr.next
        return head

