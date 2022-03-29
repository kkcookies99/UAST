 class Solution:
    def XXX(self, n: int) -> List[str]:
        ans = []
        def backstrack(s):
            if len(s) == 2*n:
                ans.append(s)
            else:
                if s.count("(") < n:
                    backstrack(s+"(")
                if s.count("(") <= n and s.count("(") > s.count(")"):
                    backstrack(s+")")
        backstrack("")
        return ans

