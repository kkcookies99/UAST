 class Solution:
    def XXX(self, nums: List[int]) -> bool:
        max_i = 0
        for i in range(len(nums)-1):
            max_i = max(max_i, i + nums[i])
            if i >= max_i:
                return False
        return True

