class Solution:
    def XXX(self, n: int) -> str:
        ans = ""
        res = "1"
        for i in range(1,n):
            cnt = 1
            for j in range(1,len(res)):
                if res[j] == res[j-1]:
                    cnt += 1
                else:
                    ans += str(cnt)
                    ans += res[j-1]
                    cnt = 1
            ans += str(cnt)
            ans += res[-1]
            res = ans
            ans = ""
        return res

