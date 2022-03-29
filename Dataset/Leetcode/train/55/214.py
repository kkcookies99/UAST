class Solution:
    def XXX(self, nums: List[int]) -> bool:
        m = len(nums) - 1
        for i in reversed(range(m)):
            if i + nums[i] >= m:
                m = i
        return m == 0

