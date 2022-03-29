 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        @lru_cache(None)
        def dfs(tp):
            if len(tp)<2:return [list(tp)]
            return [[tp[i]]+j for i in range(len(tp)) for j in dfs(tp[:i]+tp[i+1:])]
        return dfs(tuple(nums))

