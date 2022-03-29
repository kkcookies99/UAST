class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        ans, path = list(), list()
        n = len(nums)
        def dfs(nums, cur):
            if cur == n:
                ans.append(path.copy())
                return 
            for i in range(2):
                if i == 0:
                    dfs(nums, cur + 1)
                else:
                    path.append(nums[cur])
                    dfs(nums, cur + 1)
                    path.pop()

        dfs(nums, 0)

        return ans

