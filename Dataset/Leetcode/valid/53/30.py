class Solution(object):
    def XXX(self, nums):
    
        if len(nums) == 1:
            return nums[0]
        else:
            sums = [0 for i in range(len(nums))]
            sums[0] = nums[0]
            for i in range(1, len(nums)):
                sums[i] = sums[i-1] + nums[i]
            result = min(sums)
            for i in range(len(sums)):
                for j in range(i+1, len(sums)):
                    if sums[j] - sums[i] > result:
                        result = sums[j] - sums[i]
            return max(result, max(sums))

