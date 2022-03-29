 class Solution:
    def XXX(self, n: int) -> List[str]:
        def dfs(str, leftParNums, rightParNums):
            if len(str) == 2 * n:
                ans.append(str)
                return
            if leftParNums < n:
                dfs(str + '(', leftParNums + 1, rightParNums)
            if rightParNums < leftParNums:
                dfs(str + ')', leftParNums, rightParNums + 1)
            return
        
        ans = []
        dfs('', 0, 0)
        return ans

