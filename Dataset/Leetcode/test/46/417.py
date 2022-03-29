 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        
        def dfs(lists):
            res = []
            n = len(lists)
            if n == 1:
                return [[lists[0]]]
            for i in range(n):
                next_lists = lists[:i] + (lists[i+1:] if i < n - 1 else [])
                for next_list in dfs(next_lists):
                    res.append([lists[i]] + next_list)
            return res
        return dfs(nums)

