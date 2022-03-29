 class Solution(object):
    def __init__(self):
        self.res = []

    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        # 特判
        if not nums:
            return
        # 取原数组长度
        n = len(nums)
        # 设置访问标记数组，初始值均为0
        visit = [0 for _ in range(n)]
        temp = []
        self.dfs(nums, n, temp, visit)
        return self.res

    def dfs(self, nums, n, temp, visit):
        if len(temp) == len(nums):
            self.res.append(temp)
        else:
            for i in range(n):
                if not visit[i]:
                    visit[i] = 1
                    self.dfs(nums, n, temp+[nums[i]], visit)
                    visit[i] = 0

