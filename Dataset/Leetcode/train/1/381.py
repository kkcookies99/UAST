 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
         for i in range(0, len(nums)-1):
            for j in range(1, len(nums)):
                if nums[i]+nums[j]==target and i != j:
                    return [i, j]

