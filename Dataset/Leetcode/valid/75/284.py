class Solution:
    def XXX(self, nums: list[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n0 = nums.count(0)
        n1 = nums.count(1)
        n2 = nums.count(2)
        nums_new = ([0]*n0 if n0 > 0 else []) + ([1]*n1 if n1 > 0 else []) + ([2]*n2 if n2 > 0 else [])

        nums.clear()
        nums += nums_new

