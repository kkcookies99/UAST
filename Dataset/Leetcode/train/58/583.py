class Solution:
    def XXX(self, s: str) -> int:
        cnt = 0
        n = len(s)
        for i in range(n-1, -1, -1):
            if s[i] == ' ':
                if cnt == 0:
                    continue
                else:
                    return cnt
            else:
                cnt += 1
        return cnt

