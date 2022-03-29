class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        self.res = [[]]
        n = len(nums)
        def dfs(nums, start, k, tmp):
            # 回溯算法常规思路，对于解空间为树的题目，通过for循环来进行子树的遍历
            # 回溯算法三要素：边界条件、待选择列表和路径的记录
            if len(tmp) == k:
                self.res.append(tmp)
                return
            for i in range(start, n):
                # 剪枝，如果剩余的可选列表长度小于k，则剪枝
                if n-i+len(tmp) < k:
                    break
                dfs(nums, i+1, k, tmp+[nums[i]])
        
        for k in range(1, n+1):
            dfs(nums, 0, k, [])
        return self.res

