 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        ans = list()
        path = list()
        st = [False] * n

        def dfs(nums, cur):
            if cur == n:
                ans.append(path.copy())
                return 
            for i, num in enumerate(nums):
                if st[i] is False:
                    st[i] = True
                    path.append(num)
                    dfs(nums, cur + 1)
                    path.pop() # 回溯
                    st[i] = False
        dfs(nums, 0)
        return ans




