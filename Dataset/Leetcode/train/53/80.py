class Solution:
    def XXX(self, nums: List[int]) -> int:
        res = 0
        ans = nums[0]
        for n in nums:
            if res < 0:
                res = 0
            res += n
            ans = max(ans, res)
        return ans

