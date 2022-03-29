class Solution:
    def XXX(self, n: int) -> str:
        ans = '1#'
        for i in range(1, n):
            t, cnt = '', 1
            for j in range(1, len(ans)):
                if ans[j] == ans[j - 1]:
                    cnt += 1
                else:
                    t += (str(cnt) + ans[j - 1])
                    cnt = 1
            t += '#'
            ans = t
        return ans[:-1]

