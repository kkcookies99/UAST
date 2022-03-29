 class Solution:
    def XXX(self, n: int):
        ans = []

        def backtrack(s, indictor):
            if not 0 <= indictor <= n or len(s) > 2*n:
                return
            if len(s) == 2*n and indictor == 0:
                ans.append("".join(s))
                return

            s.append("(")
            backtrack(s, indictor+1)
            s.pop()
            s.append(")")
            backtrack(s, indictor-1)
            s.pop()

        backtrack(["("], 1)
        return ans

