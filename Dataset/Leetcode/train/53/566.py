 class Solution:
    def XXX(self, nums: List[int]) -> int:
        n = len(nums)
        dp_0 = nums[0]
        dp_1 = 0
        res = dp_0

        for i in range(1, n):
            dp_1 = max(nums[i], nums[i] + dp_0)
            dp_0 = dp_1
            res = max(res, dp_1)
        
        return res    

