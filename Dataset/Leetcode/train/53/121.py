class Solution:
    def XXX(self, nums: List[int]) -> int:
        res = nums[0]     # 最终结果
        s = 0             # 阶段性和
        for i in nums:
            if s > 0:     # 当阶段性和大于0时，继续向下加
                s += i
            else:         # 当阶段性和小于0时，阶段性和等于当前值
                s = i
            res = max(res, s)  # 当前阶段和与前一个最大阶段和的最大值
        return res

