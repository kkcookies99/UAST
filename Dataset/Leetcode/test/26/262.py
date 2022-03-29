 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0
        cur=nums[0]
        j=1
        for i in range(1,len(nums)):
            i=j
            if cur != nums[i]:
                cur=nums[i]
                j+=1
            else:
                nums.pop(i)
        return len(nums) 