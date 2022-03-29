 class Solution:
    def XXX(self, nums: List[int]) -> int:
        max = nums[0]
        for i in range(len(nums)):
            sum = 0
            for j in nums[i:]:
                sum = sum + j
                if sum > max:
                    max = sum
        return max

