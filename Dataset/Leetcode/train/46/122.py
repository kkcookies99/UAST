class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        def dfs(nums, vis, ans, comb):
            if len(comb) == len(nums): # 找到解返回
                ans.append(comb[:])
                return
            for i in range(len(nums)):
                if vis[i] == 0:#只取没有visit过的
                    comb.append(nums[i])
                    vis[i] = 1
                    dfs(nums, vis, ans, comb)
                    vis[i] = 0 # 回溯完毕，撤销上一个操作
                    comb.pop()

        ans = []
        comb = []
        vis = [0] * len(nums)
        dfs(nums, vis, ans, comb)
        return ans
            

