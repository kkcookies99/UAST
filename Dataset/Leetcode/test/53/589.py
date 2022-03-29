 class Solution:
    def XXX(self, nums: List[int]) -> int:
        local_max_sum, global_max_sum = nums[0], nums[0]
        for num in nums[1:]:
            local_max_sum = max(num, local_max_sum + num)
            global_max_sum = max(global_max_sum, local_max_sum)
        return global_max_sum

