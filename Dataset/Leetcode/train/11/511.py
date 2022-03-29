 class Solution:
    def XXX(self, height: List[int]) -> int:
        p = [[x, i] for i, x in enumerate(height)]
        p.sort()

        ans = 0
        max_i = min_i = p[-1][1]

        for h, i in reversed(p):
            ans = max(ans, h * max(abs(i - max_i), abs(i - min_i)))
            max_i = max(max_i, i)
            min_i = min(min_i, i)

        return ans

