 class Solution:
    def XXX(self, n: int) -> List[str]:
        ans = []
        def helper(lo=0, hi=0, cur=''):
            if lo == hi == n:
                ans.append(cur)
                return
            if lo < n:
                helper(lo + 1, hi, cur + '(')
            if hi < lo and hi < n:
                helper(lo, hi + 1, cur + ')')
        helper()
        return ans

