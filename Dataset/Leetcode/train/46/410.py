 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        def dfs(res, state, k):
            if k == 0:
                res.append(list(state))
                return
            for i in range(n):
                if nums[i] not in state:
                    state.append(nums[i])
                    dfs(res, state, k-1)
                    state.pop()

        res = []
        n = len(nums)
        dfs(res, [], n)
        return res

