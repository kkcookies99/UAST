class Solution:
    def XXX(self, s: str) -> int:
        n = len(s)
        start, end = 0, -1
        for i in range(n):
            if i == 0 and s[i] != " ":
                start = i
            if s[i] != " " and s[i-1] == " ":
                start = i
            if s[i] == " " and s[i-1] != " ":
                end = i - 1
            if i == n-1 and s[i] != " ":
                end = i
        return end - start + 1

