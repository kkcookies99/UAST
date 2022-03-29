 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            if target-nums[i] in nums:
                loc = nums.index(target-nums[i])
                if loc !=  i:
                    return [i,loc]

