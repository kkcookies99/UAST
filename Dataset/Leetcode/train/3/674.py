 class Solution:
    def XXX(self, s: str) -> int:
        n = len(s)
        if n < 2:
            return n
        maps = defaultdict(lambda : -1)
        ans = 0
        start, end = 0, 1
        while end < n:
            maps[s[start]] = start
            while start <= maps[s[end]]:
                start += 1
            maps[s[end]] = end
            end += 1
            ans = max(end - start, ans)
        return ans

