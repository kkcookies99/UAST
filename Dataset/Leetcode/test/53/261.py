class Solution:
    def XXX(self, nums: List[int]) -> int:
        if nums == None or len(nums) < 1:
            return
        nSum = 0
        maxVal = -2**31
        i = 0
        while i < len(nums):
            if nSum < 0:
                nSum = nums[i]
            else:
                nSum = nSum + nums[i]
            if nSum > maxVal:
                maxVal = nSum
            i = i + 1
        return maxVal

