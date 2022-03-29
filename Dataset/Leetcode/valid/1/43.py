 class Solution:
    def XXX(self, nums, target):
        tmp = {}
        for k, v in enumerate(nums):
            if target - v in tmp:
                return [tmp[target - v], k]
            tmp[v] = k

