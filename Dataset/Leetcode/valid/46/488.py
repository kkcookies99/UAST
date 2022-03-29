 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        ans = []
        n = len(nums)
        def dfs(i,s,tmp):
            if i==n:
                ans.append(tmp)
                return 
            for x in s:
                dfs(i+1,s-set([x]),tmp+[x])
        dfs(0,set(nums),[])
        return ans

