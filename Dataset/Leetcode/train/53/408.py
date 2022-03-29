 class Solution:
    def XXX(self, nums: List[int]) -> int:
        # 贪心
        # 连续子序和最大，当连续和为负数时立即重新计算连续和
        # 因为负数+下一个数<下一个数
        max_sum = float('-inf')
        cur_sum = 0
        for num in nums:
            if cur_sum < 0:
                cur_sum = 0
            cur_sum += num
            max_sum = max(max_sum, cur_sum)
        return max_sum

