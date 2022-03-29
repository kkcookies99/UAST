 class Solution:
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        length=len(nums)
        for i in range(length):
            if nums[i]<target:
                continue
            if nums[i]==target:
                return i
            if nums[i]>target:
                if i==0:
                    return 0
                else:
                    return i
        return length

