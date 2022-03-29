class Solution:

    def bit_mask(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        XXX = []
        for mask in range(1 << n):
            subset = []
            for i in range(n):
                if mask & 1 << i: subset.append(nums[i])
                
            XXX.append(subset)

        return XXX

    def backtracking(self, nums: List[int]) -> List[List[int]]:
        XXX, subset = [], []
        def bactkracking(p = 0):
            XXX.append(subset.copy())
            for i in range(p, len(nums)):
                subset.append(nums[i])
                bactkracking(i + 1)
                subset.pop()

        bactkracking()
        return XXX

    XXX = bit_mask  # backtracking

