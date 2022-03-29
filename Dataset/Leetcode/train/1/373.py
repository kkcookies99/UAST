 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i):
                if nums[i] + nums[j] == target:
                    return [nums.index(nums[j]), nums.index(nums[i])]

