 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        length=len(nums)
        count=0
        for i in range(1,length):
            if nums[count]!=nums[i]:
                nums[count+1]=nums[i]
                count+=1
        return count+1

