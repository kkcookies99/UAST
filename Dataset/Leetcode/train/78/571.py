 class Solution(object):
    def XXX(self, nums):
        tmp, ret = [], []
        self.dfs(nums, 0, tmp, ret)
        return ret

    def dfs(self, nums, index, tmp, ret):
        ret.append(tmp[:])
        if index >= len(nums):
            return
        for i in range(index, len(nums)):
            tmp.append(nums[i])
            self.dfs(nums, i + 1, tmp, ret)
            tmp.pop()

