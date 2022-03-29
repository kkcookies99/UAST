class Solution:
    def XXX(self, nums: List[int]) -> int:
        cur_sum = 0
        min_sum = 0
        res = float("-inf")
        for num in nums:
            cur_sum += num
            res = max(res, cur_sum - min_sum)
            min_sum = min(min_sum, cur_sum)
        return res

