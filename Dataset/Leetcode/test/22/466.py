 class Solution:
    def XXX(self, n: int) -> List[str]:
        def dfs(ans, count1, count2):
            if count1 == 0 and count2 == 0:
                res.append(ans)
                return
            if count1 > 0:
                dfs(ans + "(", count1-1, count2)
            if count2 > count1 :
                dfs(ans + ")", count1, count2-1)
        res = []
        dfs("", n, n)
        return res

