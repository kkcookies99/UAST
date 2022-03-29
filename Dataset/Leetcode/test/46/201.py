class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        res = []
        def dfs(mask , cur):
            if mask == (1 << n) - 1:
                res.append(cur[::])
            for i in range(n):
                if ((1 << i) & mask): continue
                dfs((1 << i) ^ mask,cur+[nums[i]])
        dfs(0,[])
        return res


