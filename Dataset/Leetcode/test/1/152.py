 class Solution:
    def XXX(self, nums, target):
        ast = Counter()
        n = len(nums)
        for i in range(n):
            if ast[target-nums[i]] != 0: 
                return [i,nums.index(target-nums[i])]
            else: ast[nums[i]] += 1

