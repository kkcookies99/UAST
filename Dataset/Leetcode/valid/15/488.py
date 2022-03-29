 class Solution(object):
    # 思路：回溯，visit[]回溯访问状态
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if not nums: return []
        n = len(nums)
        temp = []
        res = []
        visit = [0 for _ in range(n)]
        self.dfs(nums, n, temp, res, visit)
        return res

    def dfs(self, nums, n, temp, res, visit):
        if len(temp) == 3 and sum(temp) == 0:
            temp.sort()
            if temp not in res:
                res.append(temp)
        else:
            for i in range(n):
                if visit[i] == 0:
                    visit[i] = 1
                    self.dfs(nums, n, temp+[nums[i]], res, visit)
                    visit[i] = 0

