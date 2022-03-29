 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        def dfs(arr, path):
            if not arr:
                res.append(path)
                return
            for i in range(len(arr)):
                dfs(arr[:i] + arr[i+1:], path + [arr[i]])
        
        res = []
        dfs(nums, [])
        return res

