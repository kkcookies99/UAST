 class Solution:
    def XXX(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        isaddone = 0 # 判断是否要加一
        temp = ListNode(0)
        res = temp
        while l1 or l2:
            tmpsum = 0
            if l1:
                tmpsum = l1.val
                l1 = l1.next

            if l2:
                tmpsum += l2.val
                l2 = l2.next

            tempres = (tmpsum + isaddone) % 10
            isaddone = (tmpsum + isaddone) // 10
            res.next = ListNode(tempres)
            res = res.next

        if isaddone:
            res.next = ListNode(1)

        res = temp.next
        del temp
        return res

