 class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        d = {0: 0, 1: 0, 2: 0}
        for i in range(len(nums)):
            d[nums[i]] += 1
        s = 0
        for i in d:
            for j in range(d[i]):
                nums[s + j] = i
            s += d[i]

