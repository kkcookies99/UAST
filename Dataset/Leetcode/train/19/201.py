 class Solution(object):
    def XXX(self, head, n):
        nums = []
        while head!=None:
            nums.append(head.val)
            head = head.next
        if len(nums)<=1:
            return None
        if len(nums)==2:
            if n==1:
                return ListNode(nums[0])
            else:
                return ListNode(nums[1])
        head = ListNode()
        ans = head
        for i in range(0,len(nums)):
            if len(nums)-i != n:
                node = ListNode(nums[i])
                head.next = node
        return ans.next

