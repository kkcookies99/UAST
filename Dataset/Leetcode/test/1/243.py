 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        for i in range(0, len(nums)):
            for j in range(1, len(nums)-1):
                if nums[i]+nums[j]==target:
                    return [i, j]

