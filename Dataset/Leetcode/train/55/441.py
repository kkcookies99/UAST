  class Solution:
    def XXX(self, nums: List[int]) -> bool:
        place = len(nums)
        for i in range(len(nums) - 1, -1, -1):
            if i + nums[i] >= len(nums) - 1 or i + nums[i] >= place:
                place = i
        if place == 0:
            return True
        return False

