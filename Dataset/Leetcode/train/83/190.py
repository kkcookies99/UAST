class Solution(object):
    def XXX(self, head):
        if head==None:
            return head
        nums = []
        while head!=None:
            if head.val not in nums:
                nums.append(head.val)
            head = head.next
        node1 = ListNode(val=nums[-1])
        if len(nums)==1:
            return node1
        for i in range(len(nums)-2,-1,-1):
            node = ListNode(val=nums[i],next=node1)
            node1 = node
        return node

