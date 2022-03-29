class Solution:
    def XXX(self, nums: List[int]) -> int:
        max_cost = nums[0]
        sum_cost = 0
        for i in nums:
            sum_cost += i
            if sum_cost > max_cost : max_cost = sum_cost
            if sum_cost < 0: sum_cost = 0
        return max_cost

