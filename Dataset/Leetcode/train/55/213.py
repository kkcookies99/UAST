class Solution:
    def XXX(self, nums: List[int]) -> bool:
        m = 0
        for i, j in enumerate(nums):
            if i > m:
                return False
            m = max(m, i + j)
        return True

