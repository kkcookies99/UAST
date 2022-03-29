class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        ans = collections.deque()
        c = 1
        for n in reversed(digits):
            c, t = divmod(n + c, 10)
            ans.appendleft(t)
        if c > 0:
            ans.appendleft(c)
        return list(ans)