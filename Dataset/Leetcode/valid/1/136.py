 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        i = 0 
        while i < len(nums):
            for x in range(len(nums)):
                if i != x and nums[i] + nums[x] == target:
                    return [i, x]
            else:
                i += 1

