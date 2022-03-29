 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            try:
                j = nums[i+1:].index(target - nums[i])
                return [i, j+i+1]
            except:
                continue

